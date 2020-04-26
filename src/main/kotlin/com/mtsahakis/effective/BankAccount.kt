package com.mtsahakis.effective

class BankAccount {
    var balance = 0.0
        private set

    fun deposit(amount: Double) {
        balance += amount
    }

    @Throws(InsufficientFunds::class)
    fun withDraw(amount: Double) {
        if (amount > balance) {
            throw InsufficientFunds()
        }
        balance -= amount
    }
}

class InsufficientFunds : Exception()

fun main() {
    val account = BankAccount()
    println(account.balance)
}