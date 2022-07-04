package com.example.daggerapp

import dagger.Module
import dagger.Provides

@Module
class UserRepositiryMoudle {

    @Provides
    fun getFirebaseRepositiry(): UserRepositiry {
        return FirebaseRepositiry()
    }
}
