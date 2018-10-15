package kusha.nullreferences

fun main(args: Array<String>) {
    val str: String? = null

//    if (str != null) {
//        str.toUpperCase()
//    }

    //save call operator - ?.
    println("str is ${str?.toUpperCase()}")

    // elvice operator
    val str2 = str ?: "Default value"

    println("str2 is ${str2}")


    val something: Any = arrayOf(1, 2, 3, 4)

    val str3: String? = something as? String

    println("str3 is ${str3}")

    val notNullStr: String? = "not null"

    printText(notNullStr!!)

    val str4 = notNullStr!!
    val str5 = str4.toUpperCase()
    str4.let{
        printText(it)
    }

    val nullableInts = arrayOfNulls<Int?>(5)

    for(i in nullableInts) {
        println(i)
    }
    nullableInts[3]
}

fun printText(text: String) {
    println(text)
}