package org.example.lesson_4

fun main() {

    val isSunnyWeather = true
    val isOpenAwning = true
    val airHumidity = 20
    val season = "зима"
    val isGoodCondition: Boolean = isSunnyWeather && isOpenAwning && (airHumidity == 20) && (season != "зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodCondition")
}