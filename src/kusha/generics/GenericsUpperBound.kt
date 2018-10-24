package kusha.generics

fun main(args: Array<String>) {
    val shorts: List<Short?> = listOf(10, 20, 30, 40, null)
    convertToInt(shorts)
}

fun <T : Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num?.toInt()}")
    }
}