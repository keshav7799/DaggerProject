package com.example.daggerapp

import android.util.Log
import javax.inject.Inject

interface UserRepositiry {
    fun saveUser(email: String, password: String)
}

class DadatbaseRepositiry  : UserRepositiry {
    override fun saveUser(email: String, password: String) {
        Log.d("Tag", "user saved in db")
    }
}

class FirebaseRepositiry : UserRepositiry {
    override fun saveUser(email: String, password: String) {
        Log.d("Tag", "user saved in firebase")
        Log.d("Tag", "user saved in firebase")
        Log.d("Tag", "user saved in firebase")
    }
}