package org.example.lesson_5

fun main() {

    print("Для входа в приложение решите этот пример 2 + 5 = ?\nВаш ответ: ")
    val userAnswer = readlnOrNull()?.toIntOrNull() ?: "Вы ввели не число"
    if (userAnswer == 7) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}