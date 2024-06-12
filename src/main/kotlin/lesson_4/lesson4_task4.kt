package org.example.lesson_4

fun main() {

    val dayOfTraining = 5
    val isOdd = dayOfTraining % 2 != 0
    val isHandsTraining = isOdd
    val isLegsTraining = !isOdd
    val isBackTraining = !isOdd
    val isPressTraining = isOdd
    val trainingInformation = """
        Сегодня $dayOfTraining день тренировки и нужно выполнить:
        Упражнения для рук: $isHandsTraining
        Упражнения для ног: $isLegsTraining
        Упражнения для спины: $isBackTraining
        Упражнения для пресса: $isPressTraining
    """.trimIndent()
    println(trainingInformation)

}