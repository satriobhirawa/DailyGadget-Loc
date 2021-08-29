package com.satrio.dailygadgetlocal

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.satrio.dailygadgetlocal.model.Database


class App : Application() {
    companion object {
        lateinit var context: Context
        var db: Database? = null
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

        db = Room.databaseBuilder(
            context.applicationContext,
            Database::class.java,
            "user"
        ).build()
    }
}