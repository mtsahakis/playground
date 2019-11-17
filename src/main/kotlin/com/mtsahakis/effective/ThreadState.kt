package com.mtsahakis.effective

import kotlin.concurrent.thread

fun main() {
    var num = 0
    for (i in 1..1000) {
        thread {
            Thread.sleep(10)
            num++
        }
    }

    Thread.sleep(5000)
    println(num)
}