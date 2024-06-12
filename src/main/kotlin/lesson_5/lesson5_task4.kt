package org.example.lesson_5

fun main() {

    taskSolutionWithWhen()
    taskSolutionWithIfElse()
}

fun taskSolutionWithWhen() {
    println("Чтобы войти в систему, индетифицируйте себя!")
    print("Введите имя пользователя: ")
    val accessToShipResult = when (val userLoginInput = readln()) {
        USER_LOGIN -> {
            print("Введите Ваш пароль: ")
            val userPasswordInput = readln()
            if (userPasswordInput == USER_PASSWORD) {
                "Добро пожаловать на борт, $userLoginInput!"
            } else {
                "Неверный пароль!"
            }
        }
        else -> "Такого пользователя не существует. Пожалуйста, зарегистрируйтесь!"
    }
    println(accessToShipResult)
}
fun taskSolutionWithIfElse() {
    println("Чтобы войти в систему, индетифицируйте себя!")
    print("Введите имя пользователя: ")
    val userLoginInput = readln()
    val isLoginRegistered = userLoginInput == USER_LOGIN
    if (!isLoginRegistered) {
        println("Такого пользователя не существует. Пожалуйста, зарегистрируйтесь!")
    } else {
        print("Введите Ваш пароль: ")
        val userPasswordInput = readln()
        if (userPasswordInput == USER_PASSWORD) {
            println("Добро пожаловать на борт, $userLoginInput!")
        } else {
            println("Неверный пароль!")
        }
    }
}

const val USER_LOGIN = "Zaphod"
const val USER_PASSWORD = "PanGalactic"