package org.example.lesson_3

fun main() {

    val getMoveInformation = "D2-D4;0"
    val getServerParse = getMoveInformation.split('-', ';')
    val getFromField: String = getServerParse[0]
    val getToField: String = getServerParse[1]
    val getMoveNumber: Int = getServerParse[2].toInt()
    val infoFromServer: String = """
        Сервер получил информацию от игрока:
        Откуда: $getFromField
        Куда: $getToField
        Номер хода: $getMoveNumber
    """.trimIndent()

    println(infoFromServer)

}