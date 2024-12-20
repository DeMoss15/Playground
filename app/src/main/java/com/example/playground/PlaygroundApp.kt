package com.example.playground

import android.app.Application
import org.koin.core.context.startKoin

class PlaygroundApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                // TODO
            )
        }
    }

}