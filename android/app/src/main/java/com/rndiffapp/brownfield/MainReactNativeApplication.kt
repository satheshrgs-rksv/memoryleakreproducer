package com.rndiffapp.brownfield

import android.app.Application
import android.util.Log
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.PackageList


class MainReactNativeApplication : Application(), ReactApplication {
    override fun onCreate() {
        super.onCreate()
        val packages = PackageList(this).packages
        val options = HashMap<String, Any>()
        options["packages"] = packages
        options["mainModuleName"] = "index"

        ReactNativeBrownfield.initialize(this, options)
        ReactNativeBrownfield.shared.startReactNative { Log.d("TEST", "React Native Started") }
    }

    override fun getReactNativeHost(): ReactNativeHost {
        return ReactNativeBrownfield.shared.reactNativeHost
    }
}