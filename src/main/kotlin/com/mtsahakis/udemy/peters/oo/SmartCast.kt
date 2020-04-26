package com.mtsahakis.udemy.peters.oo

fun Bicycle.replaceWheel() {
    println("Replacing wheel")
}

fun Boat.startEngine(): Boolean {
    println("Starting engine")
    return true
}

fun main() {
    val drivable: Drivable = Bicycle()
    if (drivable is Bicycle) {
        drivable.replaceWheel()
    }
}