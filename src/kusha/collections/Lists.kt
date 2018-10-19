package kusha.collections

fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "winter", "summer")
    val colorList = listOf("black", "green", "white", "black")

    println(strings.last())
    println(strings.reversed())
    println(strings.getOrNull(5))

    val ints = listOf(1,2,3,4,5,6,7,8)
    println(ints.max())
    println(colorList.zip(strings))

    val mergedList = listOf(colorList, strings)
    println(mergedList)

    val combinedList = colorList + strings
    println(combinedList)

    val noDupsList = colorList.union(strings)
    println(noDupsList)

    val noDupColors = colorList.distinct()
    println(noDupColors)

}