package kusha.collections

fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    if (!emptyList.isEmpty()) {
        println(emptyList[1])
    }

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    val mutableList = mutableListOf<Int>(1,2,3,4,5)
    println(mutableList.javaClass)

    val array = arrayOf("black", "green", "white")
//    val colourList = listOf(*array)
    val colourList = array.toList()
    println(colourList)


}