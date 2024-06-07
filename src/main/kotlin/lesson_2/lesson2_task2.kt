package org.example.lesson_2

fun main() {

    val staffMembers = 50
    val staffMemberSalary = 30000
    val internMembers = 30
    val internMemberSalary = 20000
    val totalStaffSalary = staffMembers * staffMemberSalary
    val totalInternSalary = internMembers * internMemberSalary
    val generalSalaryFund = totalStaffSalary + totalInternSalary
    val averageMembersSalary = generalSalaryFund / (staffMembers + internMembers)

    val financialReport = """
    Количество сотрудников: $staffMembers
    Зарплата одного сотрудника: $staffMemberSalary
    Количество стажеров: $internMembers
    Зарплата одного стажера: $internMemberSalary
    Зарплатный фонд сотрудников: $totalStaffSalary
    Зарплатный фонд стажеров: $totalInternSalary
    Общий зарплатный фонд: $generalSalaryFund
    Средняя зарплата сотрудника после прихода стажеров: $averageMembersSalary
    """.trimIndent()

    println(financialReport)

}