package org.example.lesson_2

fun main() {

    val POWER_BAFF_PERCENT = 20
    val DEFAULT_PERCENT = 100
    val minedCrystalOre = 7
    val minedIronOre = 11
    val buffedCrystalOre = minedCrystalOre / DEFAULT_PERCENT * POWER_BAFF_PERCENT
    val buffedIronOre = minedIronOre / DEFAULT_PERCENT * POWER_BAFF_PERCENT

    println("Бонусная кристалическая руда: $buffedCrystalOre.\nБонусная железная руда: $buffedIronOre")

}