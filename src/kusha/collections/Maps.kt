package kusha.collections

fun main(args: Array<String>) {

    val immutableMap = mapOf(
            1 to Car("grenn", "Toyota", 2015),
            2 to Car("red", "Ford", 2012),
            3 to Car("silver", "Honda", 2017)
    )

    println(immutableMap)
    println(immutableMap.javaClass)

    val mutableMap = hashMapOf<String, Car>(
            "John's car" to Car("grenn", "Toyota", 2015),
            "Jane's car" to Car("red", "Ford", 2012)
    )

    println(mutableMap)
    println(mutableMap.javaClass)

//    for(entry in mutableMap) {
//        println(entry.key)
//        println(entry.value)
//    }
    for((k, v) in mutableMap) {
        println(k)
        println(v)
    }

    val pair = Pair(10, "ten")
//    val first = pair.first
//    val second = pair.second
    val (first, second) = pair
    println(first)
    println(second)

    val (color, model, year) = Car("red", "Ford", 2012)

    println("color=$color, year=$year, model=$model")


}

data class Car(val color: String, val model: String, val year: Int) {
//    operator fun component1 () = color
//    operator fun component2 () = model
//    operator fun component3 () = year
}