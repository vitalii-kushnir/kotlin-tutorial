package kusha.`when`

import java.math.BigDecimal

fun main(args: Array<String>) {
    val num = 120
//    val y = 10

    when (num) {
        in 100..120 -> println("in range 100..199")
        200 -> println("200")
        300 -> println("300")
        else -> println("Does not match")
    }

//    val something = 1
//    when(something) {
//        is String -> println("Is String")
//        is BigDecimal -> println("Is BigDecimal")
//        is Int -> println("Is Int")
//    }

}