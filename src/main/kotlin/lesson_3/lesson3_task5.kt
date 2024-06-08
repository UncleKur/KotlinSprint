package org.example.lesson_3

/**
 * Продолжаем работать над приложением “Шахматы”.
 * Напиши программу для сервера, которая примет строку,
 * отправленную игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.
 * * Необходимо будет сделать обратное.
 * Распарсить строку – разбить ее на 3 составляющих: откуда, куда и номер хода,
 * присвоить соответствующим переменным и распечатать по отдельности.*/

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