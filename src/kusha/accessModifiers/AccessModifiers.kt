package kusha.accessmodifiers

val MY_CONSTANT = 100

fun main(args: Array<String>) {

    val emp = Employee("Kusha")
    emp.fullTime = false
    println("The ${emp.firstName} is full time: ${emp.fullTime}")

    println("/*-----------------------------------*/")

    val car = Car("blue", "BMW", 2018)
    val car2 = car.copy(year = 2000)
    println(car)
    println(car2)
}

data class Car(val color: String, val model: String, val year: Int)


class Employee(val firstName: String, fullTime: Boolean = true) {

    var fullTime = fullTime
        get() {
            println("Running thus custom GET")
            return field
        }
        set(value) {
            println("Running thus custom SET")
            field = value

        }
}


/*
    //Long way of creating of a class

    class Employee constructor(firstName: String) {
        val firstName: String
        init {
            this.firstName = firstName
        }
    }
 */