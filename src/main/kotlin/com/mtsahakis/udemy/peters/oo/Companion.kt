package com.mtsahakis.udemy.peters.oo

interface HouseFactory {
    fun createHouse(): House
}

class House(val numberOfRooms: Int, val price: Double) {

    companion object : HouseFactory {
        const val HOUSES_FOR_SALE = 10
        fun getNormalHouse() = House(5, 100_000.0)
        fun getLuxuryHouse() = House(10, 1_000_000.0)
        override fun createHouse() = getNormalHouse()
    }
}

fun main() {
    val house = House(10, 10_000_000.0)
    println("number of rooms: ${house.numberOfRooms}")
    println("price: ${house.price}")

    val otherHouse = House.createHouse()
    println("number of rooms: ${otherHouse.numberOfRooms}")
    println("price: ${otherHouse.price}")

    val normalHouse = House.getNormalHouse()
    println("number of rooms: ${normalHouse.numberOfRooms}")
    println("price: ${normalHouse.price}")

    val luxuryHouse = House.getLuxuryHouse()
    println("number of rooms: ${luxuryHouse.numberOfRooms}")
    println("price: ${luxuryHouse.price}")
}