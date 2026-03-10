package oops

fun main() {

    var a = 100
    var b = 10

    try {
        println(a / b)
    }
    catch (ae : ArithmeticException){
        println(ae.stackTraceToString())
        println(ae.message)
        println("Can't Divide by Zero !!")
    }
    // println("This Is Exception Handling Demo!!")
    finally{
        println("This is Finally Block !!!")
    }

    println(checkExceptionOccurred(10,20))
    println(checkExceptionOccurred(10,0))

    println(checkPassword("Hi"))

}

fun checkExceptionOccurred(num1 : Int, num2 : Int) : Boolean{

    return try
    {
        println("Hi ,, This is Exception Handling in Kotlin")
        println(num1 / num2)
        false
    }
    catch (e : Exception) {
        println(e.message)
        println(e.stackTraceToString())
        true
    }
}

fun checkPassword(password : String) : Boolean {

    if(password.length < 6){
        throw Exception("Password is too short")
    }
    return true
}

