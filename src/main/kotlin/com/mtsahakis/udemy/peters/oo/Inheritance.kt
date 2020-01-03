package com.mtsahakis.udemy.peters.oo

import kotlin.math.pow

open class Shape(val name: String) {
    open fun area() = 0.0
}

class Circle(name : String, val radius: Double) : Shape(name) {
    override fun area() = Math.PI * radius.pow(2.0)
}

abstract class Animal(val name: String) {
    abstract fun run()
    abstract fun greet() : String
    open fun size() : Double = 1.0
}

class Tiger(name: String) : Animal(name) {
    override fun run() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun greet(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun size() = 2.0
}

fun main() {
    val smallCircle = Circle("small circle", 2.0)
    println(smallCircle.name)
    println(smallCircle.radius)
    println(smallCircle.area())
}