package com.example.myunittesting

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MainViewmodelTest {

    lateinit var mainViewmodel: MainViewmodel

    private val dummyLength = 1.0
    private val dummyWidth = 1.0
    private val dummyHeight = 1.0

    private val dummyCircumference = 4.0

    @Before
    fun before () {
        mainViewmodel = MainViewmodel()
    }

    @Test
    fun getCircumference() {
        val keliling = mainViewmodel.getCircumference(dummyWidth, dummyLength, dummyHeight)

        assertEquals(dummyCircumference, keliling, 0.0001 )
    }
}