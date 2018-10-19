package kusha.lambdaExpression

fun main(args: Array<String>) {
    run {
        println("I am in a lambda")
    }

    val employees = listOf(
            Employee("John", "Smith", 2012),
            Employee("Bill", "Smith", 2014),
            Employee("John", "Jones", 2018)
    )

    println(employees.minBy { e -> e.startYear })
    println(employees.maxBy { it.startYear })
    println(employees.maxBy(Employee::startYear))

    var num = 10

    run {
        num += 15
        println(num)
    }

    println(num)

    run(::topLevel)

}

fun topLevel() = println("I'm in top level fun")

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.fName)
        println(num)
    }
}

data class Employee(val fName: String, val lName: String, val startYear: Int) {

}

