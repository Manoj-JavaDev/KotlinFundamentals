

// HigherOrderFunctions are the type of functions that contains functions as parameters & return as function


fun main() {

    //higherOrderFunction(10,20,10,::myFunction)
    println()
    //higherOrderFunction(10,20,lambda1)

    inLineFunction(10,20,lambda1,lambda2)
}

fun myFunction(num1: Int, num2: Int,num3 : Int): Int {
    return num1 + num2 + num3;
}

fun higherOrderFunction(num1 : Int,num2 : Int ,num3 : Int,func : (Int ,Int ,Int)-> Int): Unit{
    print(func(num1,num2,num3))
}

fun higherOrderFunction(num1:Int,num2 : Int ,func : () -> Unit ): Unit{
    print("$num1 + " +
            " $num2 = ${num1 + num2}")
    println()
    func()
}


val lambda1 : () -> Unit = {print("Hi Manoj,Welcome to office ,today is Saturday!!")}

// Inline Functions are the functions that helps to increase the performance and decrease the memory consumption

val lambda2 : (Int,Int) -> Int = {a,b -> a+b}

inline fun inLineFunction(num1 : Int,num2 : Int, func:() -> Unit,func1: (Int,Int) -> Int) : Unit{
    func()
    println()
    println(func1(num1,num2))
}