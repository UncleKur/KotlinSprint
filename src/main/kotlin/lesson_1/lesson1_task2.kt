package org.example.lesson_1

fun main() {

    var workedEmployees: Int = 2000
    var amountOfOrders: Int = 75
    val messageToCustomerThankYouBuying: String = "Большое спасибо за покупку! Ждём Вас снова!"

    println("Всего заказов: $amountOfOrders")
    println("Шаблон благодарности за покупку:\n$messageToCustomerThankYouBuying")
//    println("Количество работников: $workedEmployees")
    workedEmployees -= 1
    println("Количество работников: $workedEmployees")
}
