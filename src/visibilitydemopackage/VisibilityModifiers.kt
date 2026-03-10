package visibilitydemopackage

fun main() {

    var mobile1 = Mobile()
    mobile1.getInfo() // can't be accessed if getInfo() declared as a private field

    var mobile2 = Mobile("Redmi",cost = 10000)
    mobile2.getInfo()

    var samsung1 = Samsung(batteryCapacity = 5000)
    println(samsung1.toString())

   // println(mobile1.name) // This property is not accessed here because it is declared as a protected keyword


}


// By default,  the access modifier of every class or class members is public only i.e accessed from anywhere
open class Mobile() {

    init {
        println("This no arg primary constructor!! ")
    }
    protected var name :  String  = "Iphone"
    var cost : Int = 0
    constructor(name : String , cost : Int) : this() {
        this.name = name
        this.cost = cost
    }
    /*private */ internal fun getInfo() { // internal can be work within the package .
        println("Calling GetInfo method of Mobile class !! ")
        println("Mobile Name = $name , cost = $cost")
    }

}

internal class Samsung : Mobile {
    var batteryCapacity : Int = 0
    constructor(batteryCapacity : Int){
        this.batteryCapacity = batteryCapacity
    }


    override fun toString(): String {
        //name = "Samsung"
        cost = 90000
        return "Samsung(name = ${super.name} , cost = ${super.cost} batteryCapacity= $batteryCapacity)"
    }

}
