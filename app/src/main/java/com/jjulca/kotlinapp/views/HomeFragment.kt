package com.jjulca.kotlinapp.views

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jjulca.kotlinapp.Data
import com.jjulca.kotlinapp.Prevention
import com.jjulca.kotlinapp.R
import com.jjulca.kotlinapp.databinding.FragmentHomeBinding
import com.jjulca.kotlinapp.toast

/**
 * @author Janett Julca
 */
private const val TAG = "HOME_FRAG"

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    //TODO adapter
    private val adapter: PreventionAdapter by lazy {
        PreventionAdapter(emptyList()) {
            goToDetailView(it)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.adapter = adapter
        retrieveData()
        //retrieveDbData()
    }

    //TODO setear data
    private fun processData() {
        val data = Data.getPreventions()
        adapter.update(data)
    }

    //TODO setear data
    private fun transformData() {
        val data = Data.getPreventionsDB().map {
            it.toPrevention()
        }.filter {
            it.id % 2 == 0
        }
        adapter.update(data)
    }

    //TODO cargar data
    private fun retrieveData() {
        Handler(Looper.getMainLooper()).postDelayed({
            processData()
        }, 2000)
    }

    //TODO cargar db data
    private fun retrieveDbData() {
        Handler(Looper.getMainLooper()).postDelayed({
            transformData()
        }, 2000)
    }

    //TODO navegar a la siguiente pantalla
    private fun goToDetailView(item: Prevention) {
        requireContext().toast(item.toString())
        Log.v(TAG, item.toString())

        val bundle = Bundle().apply {
            putParcelable("ENTITY", item)
        }
        findNavController().navigate(
            R.id.action_homeFragment_to_preventionFragment,
            bundle
        )
    }

}