package com.satrio.dailygadgetlocal.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.satrio.dailygadgetlocal.R

class RegistrationActivity : AppCompatActivity(),RegistrationActivityView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }

    override fun showNewUserData(data: String) {
        TODO("Not yet implemented")
    }
}