package com.mtsahakis.udemy.peters.oo

val foo : Int = 42

interface Drivable {
    fun drive() {
        println("from interface")
    }
}

abstract class Vehicle {
    open fun drive() {
        println("from class")
    }

    abstract fun honk()
}

class Sedan : Vehicle(), Drivable {
    override fun honk() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun drive() {
        super<Drivable>.drive()
    }
}

class Bicycle : Vehicle(), Drivable {
    override fun drive() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun honk() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class Boat : Vehicle(), Drivable {
    override fun drive() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun honk() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}