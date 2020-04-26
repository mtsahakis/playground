package com.mtsahakis.scope

val a = 1

fun fizz() {
    val b = 2
    println(a + b)
}

fun buzz() {
    val c = 3
    println(a + c)
}

fun main() {
    fizz()
    buzz()
    updateWeather(20)
    betterWeather(20)
    bestWeather(20)
}

fun updateWeather(degrees: Int) {
    val description: String
    val colour: Int
    when {
        degrees < 5 -> {
            description = "Cold"
            colour = 1
        }
        degrees < 23 -> {
            description = "Hot"
            colour = 2
        }
        else -> {
            description = "Too Hot"
            colour = 3
        }
    }

    println("The weather is $description and my colour is $colour")
}

fun betterWeather(degrees: Int) {
    val description: String
    val colour: Int
    when {
        degrees < 5 -> {
            description = "Cold"
            colour = 1
        }
        degrees < 23 -> {
            description = "Hot"
            colour = 2
        }
        else -> {
            description = "Too Hot"
            colour = 3
        }
    }

    println("The weather is $description and my colour is $colour")
}

fun bestWeather(degrees: Int) {
    val (description, colour) = when {
        degrees < 5 -> "Cold" to 1
        degrees < 23 -> "Hot" to 2
        else -> "Too Hot" to 3
    }

    println("The weather is $description and my colour is $colour")
}

data class Car(val wheels: Int)

fun stuff() {
    var a = Car(4)
    when (a) {
        Car(4) -> println("good car")
        Car(3) -> println("rubbish car")
    }
}