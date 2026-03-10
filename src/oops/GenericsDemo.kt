package oops


class Mobile11(name : String) {
    var mobileName = name;

    fun show() {
        println("Mobile name is $mobileName")
    }
}

class Mobile12<T>(val name : T) {
    init {
        println("New Mobile name is $name")
    }
}

fun main() {
    var mobile11 = Mobile11("John")
    mobile11.show()

    //throw Exception("SomeThing Went Wrong !!")

    // var mobile112 = Mobile11(74938) // Throws Compile time error
    // Then We will use generics to avoid this problem

    var mobile22 = Mobile12("John") // Both creations will work because these are creating in the dynamic time
    var mobile23 = Mobile12(100)
 }