package com.satrio.dailygadgetlocal.model
import androidx.room.Database
import androidx.room.RoomDatabase
import com.satrio.dailygadgetlocal.presenter.MainPresenterImp

@Database(entities = [User::class], version = 1)
abstract class Database : RoomDatabase(){
    abstract fun usersDao(): UsersDao

}