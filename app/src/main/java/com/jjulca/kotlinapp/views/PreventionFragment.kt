package com.jjulca.kotlinapp.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jjulca.kotlinapp.Prevention
import com.jjulca.kotlinapp.databinding.FragmentPreventionBinding

/**
 * @author Janett Julca
 */
private  const val TAG = "PREVENTION_FRAG"
class PreventionFragment : Fragment() {

    private var _binding: FragmentPreventionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPreventionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun populate() {
        (arguments?.getParcelable<Prevention>("ENTITY"))?.let {
            binding.textViewTitle.text = it.title
            binding.textViewDesc.text = it.desc
            binding.imageView.setImageResource(it.image)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        populate()
    }

}