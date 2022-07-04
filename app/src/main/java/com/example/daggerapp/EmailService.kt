package com.example.daggerapp

import android.util.Log
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from: String, body: String?)
}

class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d("Tag", "email send")
    }
}

class MessageService : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d("Tag", "message send")
    }
}