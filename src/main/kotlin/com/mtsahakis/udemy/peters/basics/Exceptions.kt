package com.mtsahakis.udemy.peters.basics

import java.io.IOException

fun main() {
    val input = try {
        getExternalInput()
    } catch (e: IOException) {
        e.printStackTrace()
    } finally {
        println("finished external input")
    }

    println("input: $input, type ${input!!::class}")
}

fun getExternalInput(): String {
    throw IOException("Could not read exception")
}