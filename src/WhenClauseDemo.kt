
fun main() {

    println("Enter the Name of Day : ")
    var day: String? = readLine().toString()

    when (day) {
        "Monday" -> println("Monday")
        "Tuesday" -> println("Tuesday")
        "Wednesday" -> println("Wednesday")
        "Thurday" -> println("Thursday")
        "Friday" -> println("Friday")
        else -> println("WeekOff")
    }

    println("Enter Student marks : ")
    var marks: Int = readLine()!!.toInt()

    when (marks) {
        in 90..100 -> println("Grade A")
        in 80..89 -> println("Grade B")
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
    }

}