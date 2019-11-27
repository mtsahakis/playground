package com.mtsahakis.udemy.oo

class City {
    var name: String = ""
        get() {
            return field.toUpperCase()
        }
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }

    var population: Int = 0
}

fun main() {
    val berlin = City()
    berlin.name = "Berlin"
    berlin.population = 3_500_000
    println(berlin.name)
    println(berlin.population)

    berlin.name = "  "
    berlin.population = 4_500_000
    println(berlin.name)
    println(berlin.population)
}