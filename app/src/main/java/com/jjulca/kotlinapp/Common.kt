package com.jjulca.kotlinapp

import android.content.Context
import android.util.Patterns
import android.widget.Toast

/**
 * @author Janett Julca
 */
fun Context.toast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}

fun String.isValidEmail(): Boolean =
    Patterns.EMAIL_ADDRESS.matcher(this).matches()