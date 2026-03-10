package oops

fun main() {
    var employee1 = Employee()
    var employee2 = Employee()
    employee1.name = "Manoj"
    employee1.id = 101
    employee2.name="Manoj"
    employee2.id = 101

    println(employee1 :: class)
    println(employee1.equals(employee2))

    println(employee1)
    println(employee2)

    val engine = Engine() // First we need to create a object of outer class to create a object of inner class
    val specs = engine.Specs() // creating an object of inner class to access to its members
    specs.showSpecs()
    specs.getNum()

    val company = Company()
    company.name = "Gee" // Customized Setters and Getters
    println(company.name)

    // private keyword that can't be accessed outside the class

    var box = Box()

   // box.color = "Blue" // Cant be accessed & throws Compile Time Error
    println(box.color)
    box.setColor("White")
    println(box.color)

}


class Employee(var name: String = "", var id: Int = 0) {

    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}

class Engine {
    var num : Int = 10
    inner class Specs {
        fun showSpecs() {
            println("250 horsepower, 6 cylinders , num = num") // num is outer class member so it cant be accessed inside inner class
        }

        // But it is possible to access the outer class members of outer class by defining the inner class using inner keyword

        fun getNum() {
            println("The Value of num from the outer class is ${num}")
        }
    }
}

class Company {
    var name: String = "DefaultValue"
        get() = field
        set(value) {
            if (value.length >= 5)
            field = value
            else println("The Company is necessary")
        }
}

class Box {
    var color : String = "Pink"
        private set
    var price : Int = 20

    fun setColor(newColor: String) {
        color = newColor
    }
}


