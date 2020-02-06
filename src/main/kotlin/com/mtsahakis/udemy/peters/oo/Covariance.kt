package com.mtsahakis.udemy.peters.oo

open class Being
open class Person : Being()
class Student : Person()

fun main() {
    val people : MutableList<Person> = mutableListOf(Person(), Person())
    people.add(Student())

    // kotlin covarience
    val events : TimeLine<Person> = timeLineOf()
    val students : List<Student> = listOf(Student(), Student())
    events.addAll(students)
}