package org.example.lesson_4

fun main() {

    print("У коробля отсутствуют повреждения?\nВведите (true - да, false - нет): ")
    val isHealthShip = readln().toBoolean()

    print("Введите количество членов экипажа: ")
    val membershipAmount = readln().toInt()

    print("Введите количество ящиков провизии: ")
    val suppliesAmount = readln().toInt()

    print("Благоприятная ли погода?\nВведите (true - да, false - нет): ")
    val isGoodWeather = readln().toBoolean()


    val canHealthyShipStartJourney = isHealthShip == SHIP_FULL_HEALTH
                && membershipAmount in MIN_MEMBERSHIP..MAX_MEMBERSHIP
                && suppliesAmount > MINIMAL_SUPPLIES
                && ((isGoodWeather == GOOD_WEATHER) || (isGoodWeather != GOOD_WEATHER))

    val canDamagedShipStartJourney = isHealthShip != SHIP_FULL_HEALTH
                && membershipAmount == MAX_MEMBERSHIP
                && suppliesAmount >= MINIMAL_SUPPLIES
                && isGoodWeather == GOOD_WEATHER

    println(
        if (isHealthShip) "Корабль без повреждений может отправиться в плавание? $canHealthyShipStartJourney"
        else "Корабль с повреждениями может отправиться в плавание? $canDamagedShipStartJourney"
    )
}

const val SHIP_FULL_HEALTH = true
const val MIN_MEMBERSHIP = 55
const val MAX_MEMBERSHIP = 70
const val MINIMAL_SUPPLIES = 50
const val GOOD_WEATHER = true