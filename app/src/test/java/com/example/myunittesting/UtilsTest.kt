package com.example.myunittesting

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class UtilsTest {

    private var utils: Utils? = null

    @Before
    fun before (){
       utils = Utils()
    }

    @Test
    fun toSimpleString() {
        val dateFormat = SimpleDateFormat("MM/dd/yyyy")
        var date: Date? = null
        try {
            date = dateFormat.parse("02/28/2018")
        } catch (e: ParseException) {
            e.printStackTrace()
        }

        assertEquals("Wed, 28 Feb 2018", utils!!.toSimpleString (date!!))
    }
}