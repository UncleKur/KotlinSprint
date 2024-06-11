package org.example.lesson_4

fun main() {

    val isSunnyWeather = true == SUNNY_WEATHER
    val isOpenAwning = true == OPEN_AWNING
    val airHumidity = 20 == AIR_HUMIDITY
    val season = "зима" != BAD_SEASON
    val isGoodCondition: Boolean = isSunnyWeather && isOpenAwning && airHumidity && season

    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodCondition")
}

const val SUNNY_WEATHER = true
const val OPEN_AWNING = true
const val AIR_HUMIDITY = 20
const val BAD_SEASON = "зима"