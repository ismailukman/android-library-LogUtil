package com.itcglobal.logutil

import android.util.Log

class LogDebugger {
    val TAG = "SUPER_AWESOME_APP"
    fun d(message: String){
        Log.d(TAG, message)
    }
}