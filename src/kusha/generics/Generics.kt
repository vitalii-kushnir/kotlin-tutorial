package kusha.generics

import java.math.BigDecimal

fun main(args: Array<String>) {
    val list = mutableListOf("Hello", "kotlin")
    list[0].toUpperCase()
    list.printCollection()

    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(0.34), BigDecimal(-32.54))
    bdList.printCollection()

}

fun <T> List<T>.printCollection() {
    for (item in this) {
        println(item)
    }
}

