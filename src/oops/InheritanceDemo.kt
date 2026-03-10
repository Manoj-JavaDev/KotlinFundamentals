package oops


open class Animal {

    var name:String = ""
    var age:Int = 0

    init{
        println("Animal init block")
    }

    constructor(name:String){
        this.name = name
        println("Animal constructor")
    }
    constructor(name:String, age:Int){
        this.name = name
        this.age = age
        println("Animal constructor with two parameters!!")
    }

    override fun toString(): String {
        return "Animal(name='$name', age=$age)"
    }

    open fun sound() {
        println("Animal sound!!")
    }
}

class Tiger:Animal{

    override fun sound() {
        println("Tiger sound!!")
    }

    init{
        println("Tiger init block")
    }

    constructor(name:String,age : Int) : super(name,age){
        println("Tiger constructor")
    }
}

fun main(){
    val t = Tiger("Tiger",20)
    t.sound()
    println(t)

    var sub = Subtraction(10,2)
    println(sub)

    CEO("Satya Nadela", 48, 250.00)

}

open class Addition(var a  : Int, var b : Int){
    init {
        println("Init block and sum of $a and $b = ${a+b}")
    }
}

class Subtraction(var a1: Int,var b1 : Int) : Addition(a1,b1){
    init {
        println("Init block and subtraction of $a1 and $b1 = ${a1-b1}")
    }

    override fun toString(): String {
        return "Subtraction(a1=$a1, b1=$b1 => ${a1-b1})"
    }
}

//base class
open class Employee1 {
    constructor(name: String,age: Int){
        println("Name of the Employee is $name")
        println("Age of the Employee is $age")
    }
}
// derived class
class CEO : Employee1{
    constructor( name: String,age: Int, salary: Double): super(name,age) {
        println("Salary per annum is $salary million dollars")
    }
}


