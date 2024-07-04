package com.rndiffapp

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.rndiffapp.brownfield.ReactNativeBrownfieldActivity
import com.rndiffapp.officialdocs.ReactNativeActivity

class LandingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen)
    }

    fun openReactNativeActivity(view: View) {
        Log.i("TEST","openReactNativeActivity Clicked")
        ReactNativeActivity.startActivity(this)
    }

    fun openReactNativeActivityWithBrownfield(view: View) {
        Log.i("TEST","openReactNativeActivityWithBrownfield Clicked")
        val intent = ReactNativeBrownfieldActivity.createReactActivityIntent(this, "MyReactNativeApp")
        startActivity(intent)
    }
}