package com.example.myunittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText



class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewmodel
    private lateinit var edtWidth: EditText
    lateinit var edtHeight: EditText
    lateinit var edtLength: EditText
    lateinit var tvResult: TextView
    lateinit var btnCalculateVolume: Button
    private lateinit var btnCalculateSurfaceArea: Button
    private lateinit var btnCalculateCircumference: Button
    private lateinit var btnSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = MainViewmodel()

        edtHeight = findViewById(R.id.edt_height) as EditText
        edtLength = findViewById(R.id.edt_length) as EditText
        edtWidth = findViewById(R.id.edt_width) as EditText
        tvResult = findViewById(R.id.tv_result) as TextView

        btnCalculateCircumference = findViewById(R.id.btn_calculate_circumference)

        btnCalculateCircumference.setOnClickListener {
            val height = edtHeight.text.toString()
            val length = edtLength.text.toString()
            val width = edtWidth.text.toString()
            val result = mainViewModel.getCircumference(height.toDouble(), length.toDouble(), width.toDouble())
            tvResult.setText(result.toString())
        }

    }
}
