package kusha.collections

fun main(args: Array<String>) {
    val setInts = setOf(10, 12, 34, 45,55,66,77)
    println(setInts.plus(20))
    println(setInts.plus(10))
    println(setInts.minus(10))
    println(setInts.minus(100))
    println(setInts.average())
    println(setInts.drop(3))
}

