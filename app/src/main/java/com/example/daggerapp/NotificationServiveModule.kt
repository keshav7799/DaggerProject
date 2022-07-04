package com.example.daggerapp

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiveModule {
    @Named("message")
    @Provides
    fun getMessageService(): NotificationService {
        return MessageService()
    }

    @Named("email")
    @Provides
    fun getEmailService(): NotificationService {
        return EmailService()
    }
}