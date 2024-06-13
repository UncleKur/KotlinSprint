package org.example.lesson_5

fun main() {

    val term1 = 2
    val term2 = 5
    print("Для входа в приложение решите этот пример $term1 + $term2 = ?\nВаш ответ: ")
    val userAnswer = readln().toInt()
    val userAccess = if (userAnswer == (term1 + term2)) "Добро пожаловать!"
    else "Доступ запрещен."

    println(userAccess)

}