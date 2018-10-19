package kusha.collections

fun main(args: Array<String>) {

    val immutableMap = mapOf(
            1 to Car("grenn", "Toyota", 2015),
            2 to Car("red", "Ford", 2012),
            3 to Car("silver", "Honda", 2017),
            4 to Car("silver", "Ford", 2017)
    )

    println(
            immutableMap
                    .asSequence()
                    .filter { it.value.model == "Ford" }
                    .map { it.value.color }
    )

    arrayOf("Joe", "Mary", "Jane").asSequence()
            .map { println("\tMapping $it"); it.toUpperCase() }
            .filter { println("Filtering $it") ; it[0] == 'J' }
            .find{ it.endsWith("E") }

}