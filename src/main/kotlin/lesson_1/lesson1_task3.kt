package org.example.lesson_1

fun main() {

    val year: Int = 1961
    var hour: String = "09"
    var minute: String = "07"

    //Про подсказку не понял - имелось ввиду не использовать print() функцию или использовать? Сделал 2 варианта
    print("Год полёта: $year\nВремя взлёта:\n$hour часов\n$minute минут\n")

    hour = "10"
    minute = "55"

    println("Время посадки: $hour:$minute")

}