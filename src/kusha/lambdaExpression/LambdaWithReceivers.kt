package kusha.lambdaExpression

fun main(args: Array<String>) {
    val employees = listOf(
            Employee("John", "Smith", 2012),
            Employee("Bill", "Smith", 2014),
            Employee("John", "Jones", 2018)
    )

    println(countTo100())
    println(countTo100_V2())
    println(countTo100_V3())

    findByLastName(employees, "Jones")
    findByLastName(employees, "Simpson")

    findByLastName_V2(employees, "Jones")
    findByLastName_V2(employees, "Simpson")

    "Some String".apply someString@ {
        "Another String".apply {
            println(toLowerCase())
            println(this@someString.toUpperCase())
        }
    }
}

fun findByLastName(employees: List<Employee>, lName: String) {
    for (e in employees) {
        if (e.lName == lName) {
            println("Yes, there's an employee with the last name $lName")
            return
        }
    }
    println("There's no employee with the last name $lName")

}

fun findByLastName_V2(employees: List<Employee>, lName: String) {
    employees.forEach returnBock@{
        if (it.lName == lName) {
            println("Yes, there's an employee with the last name $lName")
            return@returnBock
        }
    }
    println("There's no employee with the last name $lName")

}

fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i).append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}

fun countTo100_V2(): String = with(StringBuilder()) {
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100)
    toString()
}

fun countTo100_V3(): String = StringBuilder().apply {
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100)
}.toString()