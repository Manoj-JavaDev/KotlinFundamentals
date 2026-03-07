fun main() {

    val multiply : (Int,Int) -> Int = {first,second -> first * second}
    println(multiply(10,20))
    println(multiply(10,2))
    multiply.invoke(2,1)
    val company = {print("hi Manoj")}

    addition(10,2)

   company
}

// Lambda Functions are the functions which doesnt contains method name & we can pass these directly as
// Parameters.

/*
    Syntax :
        val lamda_Name : return_type = { ( argument list ) -> { body }}
 */

val primeCheck: (Int) -> Boolean = { a ->
    var isPrime = true
    for (i in 2 until a) {
        if (a % i == 0) {
            isPrime = false
            break
        }
    }
    isPrime
}

val addition = fun(a : Int ,b : Int) : Unit {
    println("$a + $b = ${a+b}")
}