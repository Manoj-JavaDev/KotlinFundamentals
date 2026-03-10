package oops

interface HI {
    fun hi();
}
data class Student11(val name : String, val rollNo : Int) : HI // Data class can implement an interface
{
    val marks = 100 // data class toString() prints only its primary constructor variables
    override fun hi() {
        println("Hi $name !! ")
    }
}

fun main() {
    var student11 = Student11("Mukesh", 42)
    println("student11 = $student11")
    student11.hi()

    var student12 = student11.copy(rollNo = 4)

    println("Student12 = $student12")

    var student13 = student12.copy(rollNo = 4)
    println("Student13 = $student13")
    println("student12 = ${student12.hashCode()}")
    println("student13 = ${student13.hashCode()}")
    println(student12 === student13)
    println(student13.equals(student12))


}

