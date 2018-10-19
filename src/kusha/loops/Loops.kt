package kusha.loops

fun main(args: Array<String>) {

    val range = 1..5
    for (i in range) {
        println(i)
    }

    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    for (s in "str") {
        println(s)
    }

    for (n in 1..50 step 4) {
        println(n)
    }

    for (n in 1 until 50 step 4) {
        println(n)
    }

    for (b in 20 downTo 1 step 4) {
        println(b)
    }

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)

    val backwardRange = 5.downTo(1)
    println(3 in backwardRange)

    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val reversedRange = stepThree.reversed()

    for (n in reversedRange) {
        println(n)
    }


    val seasons = arrayOf("spring", "summer", "winter", "fall")
    for (season in seasons) {
        println(season)
    }

    for (idx in seasons.indices) {
        println("${seasons[idx]} is season number $idx")
    }

    seasons.forEach {
        println(it)
    }

    seasons.forEachIndexed {
        idx, value ->  println("$value is season number $idx")
    }
}