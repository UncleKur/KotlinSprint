package org.example.lesson_4

/**
 * Если я верно понял условия задачи. Чел тренит 7 дней в неделю.
 * И если тренировки рук/ног начинались с нечётного дня, соотвествтенно эту проверку я и выполняю
 */
fun main() {

    val dayOfTraining = 5
    val isHandsTraining = dayOfTraining % 2 != 0
    val isLegsTraining = dayOfTraining % 2 == 0
    val isBackTraining = dayOfTraining % 2 == 0
    val isPressTraining = dayOfTraining % 2 != 0
    val trainingInformation = """
        Сегодня $dayOfTraining день тренировки и нужно выполнить:
        Упражнения для рук: $isHandsTraining
        Упражнения для ног: $isLegsTraining
        Упражнения для спины: $isBackTraining
        Упражнения для пресса: $isPressTraining
    """.trimIndent()
    println(trainingInformation)

}