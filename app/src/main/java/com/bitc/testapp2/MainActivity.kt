package com.bitc.testapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bitc.testapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("BasicSyntax", "로그를 출력합니다. method = Log.d")

        var student = IntArray(5)
        var longArray = LongArray(5)
        var charArray = CharArray(5)
        var floatArray = FloatArray(5)
        var doubleArray = DoubleArray(5)
        var stringArray = Array(5) { "" }
        var stringArray2 = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")

        student[0] = 1
        student[2] = 2

        longArray[0] = 1L
        charArray[0] = 'A'
        floatArray[0] = 1.0F
        doubleArray[0] = 1.1

        var student2 = arrayOf(1, 2, 3, 4, 5)

        Log.d("BasicSyntax", "stringArray : " + stringArray)

        Log.d("BasicSyntax", "배열 값 출력 : ${student2.get(2)}")
    }
}