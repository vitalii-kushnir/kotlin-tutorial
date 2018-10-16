package kusha.functions

fun main(args: Array<String>) {
    val reuslt = labelMultiply(3, 4)
    println(reuslt)

    val empl = Employee("kusha")
    println(empl.toUpperCase())

    val car1 = Car("blue", "BMW", 2018)
    val car2 = Car("red", "Toyota", 2017)
    val car3 = Car("black", "Ford", 2016)

    printColors(car1, car2, car3, str = "Color:")

    // spread operator
    val manyCars = arrayOf(car1,car2,car3)
    printColors(*manyCars, str = "Color:")

    val cars = arrayOf(car1,car3)
    val lotsOfCars = arrayListOf(*manyCars, *cars, car3)


    val s ="this is all in lowercase"
    println(s.upperFirstAndLast())

}

/*
    Inline function
 */
inline fun labelMultiply(operand1: Int, operand2: Int, label: String = "The result is:"): String = "$label ${operand1 * operand2}"

fun printColors(vararg cars: Car, str: String) {
    println(str)
    for (car in cars) {
        println(car.color)
    }
}

/**
 * Extension function in Kotlin
 */
fun String.upperFirstAndLast() :String {
    val upperFirst = substring(0,1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length -1) +
            upperFirst.substring(upperFirst.length -1, upperFirst.length).toUpperCase()
}

class Employee(val firstName: String) {
    fun toUpperCase() = firstName.toUpperCase()
}

data class Car(val color: String, val model: String, val year: Int)