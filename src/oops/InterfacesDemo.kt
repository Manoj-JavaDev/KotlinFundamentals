package oops

fun main() {
    var f1 = InterfaceDemo()
    println(f1 :: class.simpleName)
    f1.show()
    println()
    f1.add(3)

    var f2 = InterfaceDemo2(10,"Welcome To Kotlin !!!")

    val rect = Rectangle(length = 10.0, breadth = 5.0)
    println("Area is :${rect.area()}")
    println("Perimeter is :${rect.perimeter()}")

    var c = C()
    c.show()


}

interface FirstInterface {
    fun show() {
        println("This is interface default method!!")
    }
    fun add(num1 : Int, num2 : Int = 10)

}
class InterfaceDemo : FirstInterface {
    override fun add(num1 : Int, num2: Int) {
        println("$num1 + $num2 = ${num1 + num2}")
    }
    override fun show() {
        super.show()
        print("This class Overriden method!!")
    }
}

interface SecondInterface {
    var a : Int
    var b : String

}
class InterfaceDemo2(override var a: Int, override var b: String) : SecondInterface {
    init{
        println("The value of a and b are overridden !! a = $a, b = $b")
    }
}

// Base interface with two abstract properties
interface Dimensions {
    val length: Double
    val breadth: Double
}

// Interface extending Dimensions and adding methods
interface CalculatedParameters : Dimensions {
    fun area(): Double
    fun perimeter(): Double
}

class Rectangle(override val length: Double, override val breadth: Double) : CalculatedParameters {
    // Implement area() and perimeter() from CalculatedParameters:
    override fun area(): Double {
        return length * breadth
    }

    override fun perimeter(): Double {
        return 2 * (length + breadth)
    }
}

interface A {
    fun show() {
        println("This is A's show() method!!")
    }
}
interface B {
    fun show() {
        println("This is B's show() method!!")
    }
}

class C : A , B {
    override fun show() {
        println("This is C's Show method!!")
        super<A>.show()
        super<B>.show()
    }
}


