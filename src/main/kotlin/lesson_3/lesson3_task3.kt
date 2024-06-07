package org.example.lesson_3

fun main() {

    val multiplicationNum: Int = 5
    val multiplicationTable: String = """
        $multiplicationNum x 1 = ${multiplicationNum * 1}
        $multiplicationNum x 2 = ${multiplicationNum * 2}
        $multiplicationNum x 3 = ${multiplicationNum * 3}
        $multiplicationNum x 4 = ${multiplicationNum * 4}
        $multiplicationNum x 5 = ${multiplicationNum * 5}
        $multiplicationNum x 6 = ${multiplicationNum * 6}
        $multiplicationNum x 7 = ${multiplicationNum * 7}
        $multiplicationNum x 8 = ${multiplicationNum * 8}
        $multiplicationNum x 9 = ${multiplicationNum * 9}
    """.trimIndent()

    println(multiplicationTable)

}