package com.itcglobal.logutilexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itcglobal.logutil.LogDebug
import com.itcglobal.logutil.LogDebugger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogDebug.d("Java Message Local")

    }
}