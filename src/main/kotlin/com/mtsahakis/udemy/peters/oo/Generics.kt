package com.mtsahakis.udemy.peters.oo

import java.util.*

class TimeLine<E> {

    val date2Data: MutableMap<Date, E> = mutableMapOf()

    fun add(t: E) {
        date2Data[Date()] = t
    }

    fun getLatest(): E {
        return date2Data.values.last()
    }
}

fun <T> timeLineOf(vararg elements: T): TimeLine<T> {
    val result = TimeLine<T>()
    for (element in elements) {
        result.add(element)
    }
    return result
}

fun main() {
    val timeLine = TimeLine<Int>()
    for (i in 1..500_000) {
        timeLine.add(i)
    }
    println("latest ${timeLine.getLatest()}")
}