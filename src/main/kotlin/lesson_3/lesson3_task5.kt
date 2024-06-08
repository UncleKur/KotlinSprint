package org.example.lesson_3

fun main() {

    val getMoveInformation = "D2-D4;0"
    val getFromField: String = getMoveInformation.substringBefore('-')
    val getToField: String = getMoveInformation.substringAfter('-').substringBefore(';')
    val getMoveNumber: Int = getMoveInformation.substringAfter(';').toInt()
    val infoFromServer: String = """
        Сервер получил информацию от игрока:
        Откуда: $getFromField
        Куда: $getToField
        Номер хода: $getMoveNumber
    """.trimIndent()
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

    println(infoFromServer)

}