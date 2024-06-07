package org.example.lesson_2

fun main() {

    val studentsInClass = 4
    val firstStudentMark = 3.0f
    val secondStudentMark = 4.0f
    val thirdStudentMark = 3.0f
    val fourthStudentMark = 5.0f
    val averageMark = (firstStudentMark + secondStudentMark + thirdStudentMark + fourthStudentMark) / studentsInClass

    println(String.format("%.2f", averageMark))

}