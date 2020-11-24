package com.example.myapplication.shared

import com.example.myapplication.shared.Platform

class Factorial {
    fun main(): Long {

        val num = 10
        var factorial: Long = 1
        for (i in 1..num) {
            // factorial = factorial * i;
            factorial *= i.toLong()
        }
        return factorial
    }
}