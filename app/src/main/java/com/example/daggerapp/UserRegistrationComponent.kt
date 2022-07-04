package com.example.daggerapp

import dagger.Component
import dagger.Module


@Component(modules = [NotificationServiveModule::class, UserRepositiryMoudle::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)
}