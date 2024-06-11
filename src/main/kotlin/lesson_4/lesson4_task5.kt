package org.example.lesson_4

fun main() {

    print("У коробля отсутствуют повреждения?\nВведите (true - да, false - нет): ")
    val isHealthShip = readlnOrNull()?.toBoolean() ?: return

    print("Введите количество членов экипажа: ")
    val membershipAmount = readlnOrNull()?.toIntOrNull() ?: return

    print("Введите количество ящиков провизии: ")
    val suppliesAmount = readlnOrNull()?.toIntOrNull() ?: return

    print("Благоприятная ли погода?\nВведите (true - да, false - нет): ")
    val isGoodWeather = readlnOrNull()?.toBoolean() ?: return

    val canHealthyShipStartJourney =
        (isHealthShip == SHIP_FULL_HEALTH)
                && (membershipAmount in MIN_MEMBERSHIP..MAX_MEMBERSHIP)
                && (suppliesAmount > MINIMAL_SUPPLIES)
                && ((isGoodWeather == GOOD_WEATHER) || (isGoodWeather != GOOD_WEATHER))

    val canDamagedShipStartJourney =
        (isHealthShip != SHIP_FULL_HEALTH)
                && (membershipAmount == MAX_MEMBERSHIP)
                && (suppliesAmount >= MINIMAL_SUPPLIES)
                && (isGoodWeather == GOOD_WEATHER)

    println("Корабль без повреждений может отправиться в плавание? $canHealthyShipStartJourney")
    println("Корабль c повреждениями может отправиться в плавание? $canDamagedShipStartJourney")
}

const val SHIP_FULL_HEALTH = true
const val MIN_MEMBERSHIP = 55
const val MAX_MEMBERSHIP = 70
const val MINIMAL_SUPPLIES = 50
const val GOOD_WEATHER = true