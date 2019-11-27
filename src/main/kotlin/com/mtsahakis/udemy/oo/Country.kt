package com.mtsahakis.udemy.oo

class Country(val name: String, val area: Int = 0) {

    private fun print() = "$name $area"

}

fun main() {
    val spain = Country("Spain")
}