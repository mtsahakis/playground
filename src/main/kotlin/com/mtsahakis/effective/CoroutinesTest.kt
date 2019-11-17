package com.mtsahakis.effective

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
    var num = 0
    coroutineScope {
        println("${System.currentTimeMillis()}: coroutineScope: current thread: ${Thread.currentThread()}")
        for (i in 1..1000) {
            launch {
                println("${System.currentTimeMillis()}: $i: current thread: ${Thread.currentThread()}")
                delay(10)
                num++
            }
        }
    }
    println(num)
}