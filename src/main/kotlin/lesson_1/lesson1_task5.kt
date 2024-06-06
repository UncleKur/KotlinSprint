package org.example.lesson_1

fun main() {

    val secondsInSpace: Int = 6480
    val minutes: Int
    val hours: Int
    val seconds: Int
    val SECONDS_IN_HOUR = 3600
    val SECONDS_IN_MINUTE = 60

    hours = secondsInSpace / SECONDS_IN_HOUR
    minutes = (secondsInSpace - hours * SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    seconds = secondsInSpace - hours * SECONDS_IN_HOUR - minutes * SECONDS_IN_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}
