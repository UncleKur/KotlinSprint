package org.example.lesson_3

fun main() {

    var moveNumber: Int = 0
    var fromField: String = "E2"
    var toField: String = "E4"
    var infoAbout: String = "$fromField-$toField;${++moveNumber}"
    println(infoAbout)

    fromField = "E7"
    toField = "E5"
    moveNumber++
    infoAbout = "$fromField-$toField;$moveNumber"
    println(infoAbout)

    fromField = "D2"
    toField = "D3"
    moveNumber++
    infoAbout = "$fromField-$toField;$moveNumber"
    println(infoAbout)

}