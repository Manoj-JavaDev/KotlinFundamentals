import java.util.Scanner


/*
--> All the Default imported Packages into any kotlin File
kotlin.*
kotlin.collections.*
kotlin.ranges.*
kotlin.text.*
kotlin.io.*
java.lang.*   (on JVM)*/



fun main() {


    var sc = Scanner(System.`in`)

    var num = sc.nextInt()


    // StringTemplates are used to concatenate the strings easily and effortlessly
    println("The Factorial of $num is ${factorial(num)}")

    var number = 2

    var multiplier = 1
    do {
        println("${number} * ${multiplier} = ${number * multiplier++}" )
    } while(multiplier <= 10) // Kotlin consists do while loop also

}

fun factorial(n : Int) : Int {

    if(n <= 1) return 1

    return n * factorial(n - 1);

}
