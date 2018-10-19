package kusha.tryCatch

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main(args: Array<String>) {

    println(getNumber("33"))
    println(getNumber("33w") ?: throw IllegalArgumentException("Number is not Int"))
    println(getNumber("33w") ?: "I cannot print a result")
}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("I am in a finally block")
    }
}