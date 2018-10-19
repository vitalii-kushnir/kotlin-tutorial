package kusha.inheritance

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("HP LaserJet", 15)
    laserPrinter.printModel()

    SomethingElse("whatever")
}

abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is $modelName")

    abstract fun bestSellingPrice(): Double

}

open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName), MyInterface {
    override val number: Int = 50

    override fun myFunction(srt: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 129.99
}

class SpecialLaserPrinter(modelName: String, ppm: Int) : LaserPrinter(modelName, ppm) {

}

open class Something : MySubInterface {

    val someProperty: String
    override val number: Int = 25

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'am in a parent's constructor")
    }

    override fun myFunction(srt: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mySubFunction(num: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class SomethingElse : Something {

    constructor(someOtherParameter: String) : super(someOtherParameter) {
        println("I'am in a child's constructor")

    }
}

// Interfaces
interface MyInterface {
    val number: Int
    val number2: Int
        get() = number * 100

    fun myFunction(srt: String): String
}

interface MySubInterface : MyInterface {
    fun mySubFunction(num: Int): String

}