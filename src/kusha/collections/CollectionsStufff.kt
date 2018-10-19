package kusha.collections

fun main(args: Array<String>) {

    val setInts = setOf<Int>(1, 2, 3, 4, 5)

    println(setInts.filter { it % 2 != 0 })

    val immutableMap = mapOf(
            1 to Car("grenn", "Toyota", 2015),
            2 to Car("red", "Ford", 2012),
            3 to Car("silver", "Honda", 2017)
    )
    println(immutableMap.filter { it.value.year == 2012 })

    val ints = arrayOf(1,2,3,4,5,6)
//    val add10List : MutableList<Int> = mutableListOf()
//    for(i in ints) {
//        add10List.add(i + 10)
//    }
//    println(add10List)
    val add10List = ints.map { it +10  }
    println(add10List)



}