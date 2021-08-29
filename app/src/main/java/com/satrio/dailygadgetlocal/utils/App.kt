package com.satrio.dailygadgetlocal.utils

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.satrio.dailygadgetlocal.model.Database


class App: Application() {
    companion object {
        lateinit var context: Context
        lateinit var db: Database
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

        db = Room.databaseBuilder(
            context.applicationContext,
            Database::class.java,
            "UserDB"
        ).build()
    }
}