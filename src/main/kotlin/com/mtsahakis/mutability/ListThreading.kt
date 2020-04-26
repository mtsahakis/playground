package com.mtsahakis.mutability

import kotlin.concurrent.thread

fun main() {
    for (i in 1..10) {
        mutableListOfThreading()
    }
    println("########################")
    for (i in 1..10) {
        listOfThreading()
    }
}

fun mutableListOfThreading() {
    val list = mutableListOf<Int>()
    thread {
        for (i in 1..1000) {
            list += 1
        }
    }
    Thread.sleep(1000)
    println("mutableListOfThreading(): size list : ${list.size}")
}

fun listOfThreading() {
    var list = listOf<Int>()
    thread {
        for (i in 1..1000) {
            list += 1
        }
    }
    Thread.sleep(1000)
    println("listOfThreading(): size list : ${list.size}")
}