package com.mtsahakis.scope

data class User(val name: String)

fun main() {
    val users = listOf(User("manos"), User("jamie"))

    // loops
    for (user in users) {
        println("simple loop: user: $user")
    }

    // index loop
    for (i in users.indices) {
        val user = users[i]
        println("indices loop: user: $i : $user")
    }

    // with index loop
    for ((i, user) in users.withIndex()) {
        println("with index loop: user: $i : $user")
    }
}

