package org.example.lesson_5

fun main() {

    println("Компьютер загадал три числа от 0 до 42")
    val lotteryWiningNumbersStore = mutableListOf<Int>()
    for(i in 0 until 3) {
        val randomNum = (0..42).random()
        lotteryWiningNumbersStore.add(randomNum)
    }

    println("Попробуй отгадать эти числа :)")
    val usersNumbersStore = mutableListOf<Int>()
    print("Введите первое число (от 0 до 42): ")
    val userInputNumber1 = readln().toInt()
    usersNumbersStore.add(userInputNumber1)
    print("Введите второе число (от 0 до 42): ")
    val userInputNumber2 = readln().toInt()
    usersNumbersStore.add(userInputNumber2)
    print("Введите второе число (от 0 до 42): ")
    val userInputNumber3 = readln().toInt()
    usersNumbersStore.add(userInputNumber3)

    val totalNumbersMatched = lotteryWiningNumbersStore.intersect(usersNumbersStore.toSet())
    val gameResult = when(totalNumbersMatched.size) {
        3 -> "Вы угадали все числа, и выйграли Джекпот!"
        2 -> "Вы угадали 2 числа из 3, и выйграли крупный приз!"
        1 -> "Вы угадали 1 число из 3, и выйграли утешительный приз!"
        else -> "Вы не угадали ни одного числа!"
    }
    println(gameResult)
    println("Номера введённые пользователем: $usersNumbersStore")
    println("Выигрышные номера: $lotteryWiningNumbersStore")

}