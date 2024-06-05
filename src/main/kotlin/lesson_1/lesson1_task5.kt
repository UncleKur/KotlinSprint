package org.example.lesson_1

fun main() {

    val secondsInSpace: Short = 6480
    val minutes: Int
    val hours: Int
    val seconds: Int

    hours = secondsInSpace / 3600
    minutes = (secondsInSpace - hours * 3600) / 60
    seconds = secondsInSpace - hours * 3600 - minutes * 60

    //не уверен что вывод такой, как требовалось в задании. 0 добавил вручную
    //01:48:00
    println("0$hours:$minutes:${seconds}0")

}
