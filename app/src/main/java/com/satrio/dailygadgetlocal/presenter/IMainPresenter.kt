package com.satrio.dailygadgetlocal.presenter

interface IMainPresenter {
    fun addNewUser(username: String, password: String, address: String, email: String)
}