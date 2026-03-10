package oops

import visibilitydemopackage.Samsung


fun main() {
    var person1 = Person("Hi")
    var person2 = Person(age = 25)

    println(person1)
    println(person2)
    var person3 = Person("Hyder", age = 25,120)
    println(person3)

    var s1 = Student("Pavan",120,203)
    println(Person(s1.name, s1.age))
    println(s1)

    var bike1 = Bike()
    println(bike1)

    var samsung22 = Samsung(2990)

    println(samsung22.toString())

}

open class Person(val name: String = "Manoj", val age: Int = 100) {
    init {
        println("init block called When calling primary constructor!!")
    }
    var height : Int = 0;
    constructor(name : String ,age : Int,height : Int) : this(name, age) {
        this.height = height
    }

    override fun toString() = "Person[name = $name, age = $age, height = $height]"
}

class Student(var sname : String,var sage : Int  ,var rollNo : Int) : Person() {

    override fun toString(): String {
        return "Student(sname='$sname', sage=$sage, rollNo=$rollNo)"
    }
}

class Bike(var brand: String, var model: String, var year: Int) {
    fun getInfo() {
        println("$brand $model, year $year")
    }

    override fun toString(): String {
        return "Bike(brand='$brand', model='$model', year=$year)"
    }
    constructor() : this("Unknown", "Unknown", 0)
}