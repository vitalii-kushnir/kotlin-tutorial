package kusha.dataTypes

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    val emp1 = Employee("Mary", 1)
    val emp2 = Employee("John", 2)
    val emp3 = Employee("John", 2)

    println(emp1 == emp2)
    println(emp2 == emp3)
    println(emp2 === emp3)

    println(emp1.equals(emp2))
    println(emp3.equals(emp3))

    // it is immutable == final in Java
    val number = 10

    val names = arrayListOf("John", "Jane", "Mary")

    val employees: EmployeeSet

    val employee1 = Employee("LynnJones", 500)
    employee1.name = "Lynn Smith"

    val employee2: Employee
    val number2 = 200

    if (number < number2) {
        employee2 = Employee("Jane Smith", 400)
    } else {
        employee2 = Employee("Mike Smith", 150)
    }

}

class Employee(var name: String, val id: Int) {



    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Employee

        if (name != other.name) return false
        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + id
        return result
    }

    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}