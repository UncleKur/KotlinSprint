package org.example.lesson_2

fun main() {

    val MINUTES_IN_HOUR = 60
    val getDepartureTimeHours = 9
    val getDepartureTimeMinutes = 39
    val departureTimeInMinutes = getDepartureTimeHours * MINUTES_IN_HOUR + getDepartureTimeMinutes
    val getTravelTimeInMinutes = 457
    val arrivalTimeInMinutes = departureTimeInMinutes + getTravelTimeInMinutes
    val resultArrivalTimeInHours = arrivalTimeInMinutes / MINUTES_IN_HOUR
    val resultArrivalTimeInMinutes = arrivalTimeInMinutes % MINUTES_IN_HOUR

    println("$resultArrivalTimeInHours:$resultArrivalTimeInMinutes")

}