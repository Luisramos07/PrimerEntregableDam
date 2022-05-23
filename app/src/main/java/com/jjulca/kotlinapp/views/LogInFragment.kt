package com.jjulca.kotlinapp.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.jjulca.kotlinapp.R
import com.jjulca.kotlinapp.databinding.FragmentLogInBinding
import com.jjulca.kotlinapp.isValidEmail

/**
 * @author Janett Julca
 */
class LogInFragment : Fragment() {

    private var _binding: FragmentLogInBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLogInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonLogIn.setOnClickListener {
           if(validateForm()) {
               //navigateToHome()
               showMessage()
           }
        }
    }

    private fun validateForm():Boolean {
        clear()
        val username = binding.textInputLayoutUsername.editText?.text.toString()
        val password = binding.textInputLayoutPassword.editText?.text.toString()
        if(username.isEmpty()) {
            binding.textInputLayoutUsername.error = "Ingresar el nombre"
            return false
        }

        if(!username.isValidEmail()) {
            binding.textInputLayoutUsername.error = "E-mail inválido"
            return false
        }

        if(password.isEmpty()) {
            binding.textInputLayoutPassword.error = "Ingresar el password"
            return false
        }
        return true
    }

    private fun clear() {
        binding.textInputLayoutUsername.error = null
        binding.textInputLayoutPassword.error = null
    }

    private fun showMessage() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(requireContext())
        builder.setTitle("")
        builder.setMessage("Enviando al servidor...")
        builder.setPositiveButton("Aceptar") { _, _ ->
            navigateToHome()
        }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun navigateToHome() {
        findNavController().navigate(R.id.action_logInFragment_to_homeFragment)
    }

}