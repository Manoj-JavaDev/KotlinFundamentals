
fun main() {

   println("Enter First Number : ")
    var num1 = readLine()!!.toInt()
    println("Enter Second Number : ")
    var num2 = readLine()!!.toInt()

    println("Enter sum of Numbers is : ${sum(num1, num2)} : ")


    student(marks = 200)
    student(name = "Hyder",marks = 200, rollNo = 25)

    printNumber(0)
    println()
    println(fibonacci(4))




}
fun sum(a: Int, b: Int): Int {
    var c = a + b
    return c
}

fun student(name : String = "Manoj",rollNo : Int = 10,marks:Int) {

    println("Name of the Student is $name")
    println("RollNo is $rollNo")
    println("Mark is $marks")
}

// Recursive Function

fun printNumber( num : Int ){
    print("$num ")
    if(num > 10) return
    else
    printNumber(num+1)

}
var count = 0
fun fibonacci(num : Int) : Int{

    if(num <= 1) return num

    else return fibonacci(num-1) + fibonacci(num-2)

}