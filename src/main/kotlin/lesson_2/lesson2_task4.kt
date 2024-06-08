package org.example.lesson_2

fun main() {

    val powerBaffPercent = 20f
    val minedCrystalOre = 7
    val minedIronOre = 11
    val bonus = powerBaffPercent / DEFAULT_PERCENT
    val buffedCrystalOre = (minedCrystalOre * bonus).toInt()
    val buffedIronOre = (minedIronOre * bonus).toInt()

    println("Бонусная кристалическая руда: $buffedCrystalOre.\nБонусная железная руда: $buffedIronOre")

}

const val DEFAULT_PERCENT = 100
