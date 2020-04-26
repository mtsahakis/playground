package com.mtsahakis.mutability

import kotlin.concurrent.thread

fun main() {
    // immutable list
    var list = listOf(1, 2, 3)

    // at run time for Kotlin/JVM it is Arrays$ArrayList
    // Arrays$ArrayList implements the List interface
    if (list is MutableList) {
        println("This is a list: ${list::class}")
    }

    // it is a var so we can rurn this into a mutable list
    list = mutableListOf()
    list.add(1)
    println("This is a list: ${list::class}")

    // list mutability - mutable list
    val list1 = mutableListOf<Int>()
    list1.add(1)
    list1 += 2
    println("This is a list1: $list1")

    // list mutability - immutable list plus adding one
    var list2: List<Int> = listOf(1)
    list2 = list2 + 2
    println("This is a list2: $list2")

    // using a thread to mutate the list
    val list3 = mutableListOf<Int>()
    for (i in 1..1000) {
        thread {
            list3 += 1
        }
    }
    Thread.sleep(1000)
    println("This is a list3 size: ${list3.size}")

    val list4 = listOf(1, 2)
    // does not compile ==> list4 += 1
    // val list = listOf()
    // list += 1 ==> this will not be plusAssign() as plusAssign is merely add() for mutableList
    // list += 1 ==> this will be plus() ==> need to reassign the list x cannot compile since it is a val
}