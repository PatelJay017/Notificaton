package com.jay.notifications

import android.app.Application
import com.jay.notifications.CustomNotificationsManager.createNotificationChannel

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
    }
}