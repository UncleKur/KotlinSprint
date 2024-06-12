package org.example.lesson_5
import java.util.Calendar

fun main() {

    print("Введите год Вашего рождения: ")
    val userYearOfBirth = readln().toInt()
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)
    val userAge = currentYear - userYearOfBirth

    val resultAccess = if(userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Вернутся на главный экран"

    println(resultAccess)
}

const val AGE_OF_MAJORITY = 18