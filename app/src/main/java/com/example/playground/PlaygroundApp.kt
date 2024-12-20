package com.example.playground

import android.app.Application
import com.example.playground.di.initKoin

class PlaygroundApp: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

}