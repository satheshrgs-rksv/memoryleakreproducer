package com.rndiffapp.brownfield

import android.app.Application
import android.util.Log
import com.facebook.react.PackageList
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost

import java.util.HashMap

class MainReactNativeApplication : Application(), ReactApplication {
    override fun onCreate() {
        super.onCreate()
        val packages = PackageList(this).packages
        val options = HashMap<String, Any>()
        options["packages"] = packages
        options["mainModuleName"] = "index"

        ReactNativeBrownfield.initialize(this, options)
        ReactNativeBrownfield.shared.startReactNative {
            Log.d("TEST", "React Native Started")
        }
    }

    override val reactNativeHost: ReactNativeHost
        get() = ReactNativeBrownfield.shared.reactNativeHost
}