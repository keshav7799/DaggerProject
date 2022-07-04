package com.example.daggerapp

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    private var userRepositiry: UserRepositiry,
    @Named("email") private var notificationService: NotificationService

) {

    fun registerUser(email: String, password: String) {
        userRepositiry.saveUser(email, password)
        notificationService.send(email, "n-reply@gmail.com", "user registered")

    }
}