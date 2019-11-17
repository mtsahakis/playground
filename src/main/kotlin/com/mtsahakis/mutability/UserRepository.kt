package com.mtsahakis.mutability

data class User(val name: String)

class UserRepository {
    private val users = mutableMapOf<Int, String>()
    fun loadUsers() = users

    fun immutableLoadUsers() : Map<Int, String> = users

}

// there are two wrongs with this code
// 1. data class User is not used
// 2. loadUsers() returns `users` which is a mutableMap so it can be mutated

fun main() {
    val userRepository = UserRepository()

    // loadUsers() is bad
    val users = userRepository.loadUsers()
    users[0] = "manos"
    users[1] = "manos"
    println("users: $users")

    val users1 = userRepository.loadUsers()
    println("users1: $users1")
    users1[2] = "manos"
    println("users: $users")
    println("users1: $users1")

    val users3 = userRepository.immutableLoadUsers()
    // users3[3] = "manos" // does not compile
}

// solution
// 1. remove User data class
// 2. create immutableLoadUsers() : Map<Int, String>