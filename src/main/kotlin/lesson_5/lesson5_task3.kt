package org.example.lesson_5

fun main() {

    print("Введите первое число: ")
    val userInputNumber1 = readln().toInt()
    print("Введите второе число: ")
    val userInputNumber2 = readln().toInt()
    val winningNumber1 = 4
    val winningNumber2 = 32
    val winningNumbers = "$winningNumber1, $winningNumber2"
    val lotteryResult = if ((userInputNumber1 == winningNumber1 || userInputNumber1 == winningNumber2)
        && (userInputNumber2 == winningNumber1 || userInputNumber2 == winningNumber2)
    )
        "Поздравляем! Вы выиграли главный приз!"
    else if ((userInputNumber1 == winningNumber1 || userInputNumber1 == winningNumber2)
        || (userInputNumber2 == winningNumber1 || userInputNumber2 == winningNumber2)
    )
        "Вы выиграли утешительный приз!"
    else "Неудача!"

    println(lotteryResult)
    println("Выигрышные числа были: $winningNumbers")
    println("Вы ввели: $userInputNumber1, $userInputNumber2")
}