package org.example.lesson_2
import kotlin.math.*

fun main() {

    val depositYears = 20
    val startingAmount = 70000
    val percentRate = 16.7
    val interestRateMultiplier = (1 + percentRate/100).pow(depositYears)
    val totalAmount = startingAmount * interestRateMultiplier

    println("%.3f".format(totalAmount))

}