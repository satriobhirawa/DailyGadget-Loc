package com.satrio.dailygadgetlocal.presenter

import android.text.TextUtils
import android.widget.EditText
import com.satrio.dailygadgetlocal.model.User
import com.satrio.dailygadgetlocal.App
import com.satrio.dailygadgetlocal.view.RegistrationActivityView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RegistrationPresenter(private val v: RegistrationActivityView) {

    fun fieldIsEmpty(
        username: EditText,
        password: EditText,
        address: EditText,
        email: EditText
    ): Boolean = when{
        TextUtils.isEmpty(username.getText()) -> {
            username.error = "Username must be filled"
            true
        }
        TextUtils.isEmpty(password.getText()) -> {
            password.error = "Password must be filled"
            true
        }
        TextUtils.isEmpty(address.getText()) -> {
            address.error = "Address must be filled"
            true
        }
        TextUtils.isEmpty(email.getText()) -> {
            email.error = "email must be filled"
            true
        }
        else -> false
    }

    fun register(user: User) {
        GlobalScope.launch(Dispatchers.IO) {
            try {
                App.db
                    ?.usersDao()
                    ?.insertUser(user)

                launch(Dispatchers.Main) {
                    v.regSuccess()
                }
            } catch (e: Exception) {
                launch(Dispatchers.Main) {
                    v.regFailed(e.message.toString())
                }
            }
        }
    }

}