package com.mtsahakis.strings

fun rotate(str: String, index: Int) : String {
    require(index < str.length) { "wrong index $index" }
    val cutOff = str.length - index
    return str.substring(cutOff) + str.substring(0, cutOff)
}

fun main() {
    for (i in 0 until "Kotlin is awesome".length) {
        println(rotate("Kotlin is awesome", i))
    }
}