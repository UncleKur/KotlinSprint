package org.example.lesson_5

fun main() {

    checkUserIdentity()
}

fun checkUserIdentity() {
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

const val USER_LOGIN = "Zaphod"
const val USER_PASSWORD = "PanGalactic"