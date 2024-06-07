package org.example.lesson_3

fun main() {

    var lastName: String = "Андреева"
    val firstName: String = "Татьяна"
    val surName: String = "Сергеевна"
    var age: Int = 20

    println("$lastName $firstName $surName, $age")

    lastName = "Сидорова"
    age = 22

    println("$lastName $firstName $surName, $age")

}