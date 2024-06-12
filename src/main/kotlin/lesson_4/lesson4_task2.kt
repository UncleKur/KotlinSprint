package org.example.lesson_4

fun main() {

    var load = 42
    var volume = 120
    var categoryInformation = "Груз с весом $load кг и объемом $volume соответствует категории 'Average':" +
            " ${(load > MIN_WEIGHT && load <= MAX_WEIGHT) && volume < VOLUME_UP_TO}"
    println(categoryInformation)

    load = 20
    volume = 80
    categoryInformation = "Груз с весом $load кг и объемом $volume соответствует категории 'Average':" +
            " ${(load > MIN_WEIGHT && load <= MAX_WEIGHT) && volume < VOLUME_UP_TO}"
    println(categoryInformation)

    load = 50
    volume = 100
    categoryInformation = "Груз с весом $load кг и объемом $volume соответствует категории 'Average':" +
            " ${(load > MIN_WEIGHT && load <= MAX_WEIGHT) && volume < VOLUME_UP_TO}"
    println(categoryInformation)

}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val VOLUME_UP_TO = 100