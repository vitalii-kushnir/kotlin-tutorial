package kusha.inheritance

import java.time.Year

fun main(args: Array<String>) {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("This is the first string")
    val someClass2 = SomeClass.upperOrLowerCase("This is the second string", false)
    println(someClass1.someString)
    println(someClass2.someString)

    // anonymous object
    wantsSomeInterface(object : SomeInterface {
        override fun mustImplement(num: Int): String = "This is from mustImplement: ${num * 100}"
    })

    println(Department.IT.getDepartmentInfo())
}

fun topLevel(str:String) = println("Top level function: $str")

// example of enums in Kotlin
enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5),
    IT("Information Technologies", 10),
    SALES("Sales", 20);

    fun getDepartmentInfo() = "The $fullName has $numEmployees employees"
}


object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "My company"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company"


}

// example of object companion
class SomeClass private constructor(val someString: String) {

    companion object {

        private val privateVar = 6

        fun accessPrivateVar() {
            println("The privateVar is $privateVar")
        }

        fun justAssign(str: String) = SomeClass(str)

        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.toLowerCase())
            } else {
                return SomeClass(str.toUpperCase())
            }
        }
    }
}


// example of anonymous object
interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface: ${si.mustImplement(22)}")
}