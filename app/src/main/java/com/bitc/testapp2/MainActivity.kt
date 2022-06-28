package com.bitc.testapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bitc.testapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("BasicSyntax", "로그를 출력합니다. method = Log.d")

        val student: IntArray = IntArray(5)
        val longArray: LongArray = LongArray(5)
        val charArray: CharArray = CharArray(5)
        val floatArray: FloatArray = FloatArray(5)
        val doubleArray: DoubleArray = DoubleArray(5)
        val stringArray: Array<String> = Array(5) { "" }
        var stringArray2 = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")

        student[0] = 1
        student[2] = 2

        longArray[0] = 1L
        charArray[0] = 'A'
        floatArray[0] = 1.0F
        doubleArray[0] = 1.1

        val student2: Array<Int> = arrayOf(1, 2, 3, 4, 5)

        Log.d("BasicSyntax", "stringArray : " + stringArray)


        Log.d("BasicSyntax", "배열 값 출력 : ${student2.get(2)}")


        var list = mutableListOf(1, 2, 3)
        var list2 = listOf(1, 2, 3)
        var list3 = mutableListOf<Int>()
        var list4 = listOf<Int>()
        var list5 = emptyList<Int>()

        Log.d("ListSyntax", "${list.size}")
        Log.d("ListSyntax", "${list2.get(1)}")
        Log.d("ListSyntax", "${list2[1]}")

        Log.d("ListSyntax", "${list3.size}")
        Log.d("ListSyntax", "${list4.size}")
        Log.d("ListSyntax", "${list4.size}")

        list3.add(1)
        list3.add(2)
        Log.d("ListSyntax", "${list3.size}")


        for (index in 0..10) {
            Log.d("ForSyntax", "index : $index")
        }

        for (index in 0 until 10) {
            Log.d("ForSyntax", "until index: $index")
        }

        for (value in 0 .. 30 step 3) {
            Log.d("ForSyntax", "step : $value")
        }

        for (value in 10 downTo 0) {
            Log.d("ForSyntax", "downTo : $value")
        }

        for (value in 10 downTo 0 step 2) {
            Log.d("ForSyntax", "downTo: $value")
        }

        var arrMonth = arrayOf<String>("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
        for (month in arrMonth) {
            Log.d("ForSyntax", "month : $month")
        }

        var squareResult = square(30)
        Log.d("fun", "30의 제곱은 $squareResult 입니다.")

        printSum(3, 5)

        val PI = getPI()
        Log.d("fun", "지름이 10인 원의 둘레는 ${10 * PI} 입니다.")





    }

    private fun square(x: Int) : Int {
        return x * x
    }

    private fun printSum(x: Int, y: Int) {
        Log.d("fun", "x + y = ${x + y}")
    }

    private fun getPi(): Double {
        return 3.14
    }

    private fun getPI(): Double {
        return 3.14
    }

    private fun newFunction(name: String, age: Int = 29, weight: Double = 65.5) {
        Log.d("fun", "name의 값은 $name 입니다.")
        Log.d("fun", "age의 값은 $age 입니다.")
        Log.d("fun", "weight의 값은 $weight 입니다.")
    }
}