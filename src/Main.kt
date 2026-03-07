import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var intMax : Int = Int.MAX_VALUE;
    var intMin : Int = Int.MIN_VALUE;

    println("The Maximum value of Int in kotlin is : $intMax");

    println("The Minimum value of Int is : $intMin");


    var arr = arrayOf<Int>(1,2,3,4,5);

    println(arr);

    println(arr.contentToString())

    println("At index 0 : " + arr.get(0));

    println(arr.size)

    println(arr.lastIndex)



    var a : Int = 100
    var b : Int = 200

    println(a+b == a.plus(b))

    println(a % b == a.rem(b))

   /* var sc : Scanner = Scanner(System.`in`);

    var number1 : String?= readLine();

    println(number1?.toInt())*/

    println(b)

    var manoj = "Manoj"
    println(manoj.contentEquals("Hi"))

    var student1 = Student();

    student1.setName("Manoj");

    println(student1)

    student1.name = "Hyder"

    println(student1)

    var num1 = 0
    var num2 = 10

    var result = if(num1 > num2){
                    println(num1)
    } else
    {
        println(num2)

    }
    println(result)
/*
    var arr1 = arrayOf<Int>(1,2,3,4,5);

    for(i in 7 downTo 1 step 2) {
        print("$i ")
    }
    println()

    for((index, value) in arr1.withIndex()) {
        println("arr[$index] =  $value")
    }

    println("Enter the Name of Day : ")
    var day : String? = readLine().toString()

    when (day) {
        "Monday" -> println("Monday")
        "Tuesday" -> println("Tuesday")
        "Wednesday" -> println("Wednesday")
        "Thurday" -> println("Thursday")
        "Friday" -> println("Friday")
        else -> println("WeekOff")
    }

    println("Enter Student marks : ")
    var marks : Int = readLine()!!.toInt()

    when (marks) {
        in 90..100 -> println("Grade A")
        in 80 .. 89  -> println("Grade B")
        in 70..79 -> println("Grade C")
        in 60..69 -> println("Grade D")
        in 50..59 -> println("Grade F")
        else -> println("Student Failed !!")
    }

    println("Enter Number To Check the Given Number is Even Or odd ??")
    println("Enter Number:")

    val checkingNumber = readLine()!!.toInt()

    when {
        checkingNumber % 2 == 0 -> println("Even")
        else -> println("Odd")
    }*/

    var arr33=arrayOf(1,2.0,8.7f,3,4.8f,5,6f,7.7f,8f,9.7f,10f)
    println(arr33::class.simpleName)

    var arr22=arrayOf(1,2.0,8.7f,3,4.8f,5,6f,7.7f,8f,9.7f,10f,"Hello")
    println(arr22::class.simpleName)
    println(arr22[0]::class.simpleName)
    println(arr22[1]::class.simpleName)
    println(arr22[2]::class.simpleName)
    println(arr22[arr22.lastIndex]::class.simpleName)


/*

    var sc = Scanner(System.`in`)

    var num = sc.nextInt()

    println("The Factorial of $num is ${factorial(num)}")
*/
    var number = 2

    var multiplier = 1
    do {
        println("${number} * ${multiplier} = ${number * multiplier++}" )
    } while(multiplier <= 10)

}

/*
fun factorial(n : Int) : Int {

    if(n <= 1) return 1

    return n * factorial(n - 1);

}*/
