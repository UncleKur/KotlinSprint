package org.example.lesson_4

fun main() {

    val todayReservedTable = TABLE_AMOUNT
    val tomorrowReservedTarget = TABLE_AMOUNT - 4

    println("Доступность столиков на сегодня: ${todayReservedTable < TABLE_AMOUNT}")
    println("Доступность столиков на завтра: ${tomorrowReservedTarget < TABLE_AMOUNT}")

}

const val TABLE_AMOUNT = 13