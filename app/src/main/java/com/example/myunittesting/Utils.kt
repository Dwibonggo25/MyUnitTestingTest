package com.example.myunittesting

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*


class Utils {

    fun toSimpleString(date: Date): String {
        return SimpleDateFormat("EEE, dd MM yyy").format(date)
    }
    
}