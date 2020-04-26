package com.mtsahakis.udemy.peters.basics

import java.io.File

fun main() {
    File("foo.txt").bufferedReader().let {
        it.readLines()
    }

    File("foo.txt").bufferedReader().use {
        it.readLines()
    }

    var str: String? = "kotlin"
    str?.let {
        println(it)
    }
}

fun readFileAsLinesUsingUseLines(fileName: String): List<String> = File(fileName).useLines { it.toList() }

fun readFileLineByLineUsingForEachLine(fileName: String) = File(fileName).forEachLine { println(it) }

fun readFileAsLinesUsingBufferedReader(fileName: String): List<String> = File(fileName).bufferedReader().readLines()
