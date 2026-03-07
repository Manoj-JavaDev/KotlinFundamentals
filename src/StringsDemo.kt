
fun main() {

    var str1 : String = "Manoj"
    var str2 : String = "Manoj"

    println(str1 == str2) // Internally == operator uses equals method to compare Strings so it returns true.

    var s1 = String(charArrayOf('a', 'b', 'c')) // This Way Creates String outside the String pool
    println(s1)

    var s3 = String("Manoj".toCharArray())
    println(s3)

    println(str1 == s3) // Structural Equality
    println(str1 === s3) // Referential Equality

    var a : Char = 'a'
    var b : Char = 'a'

    println("a == b ${a === b}")


    var num : Int = 10
    var num2 : Int = 10

    println(num === num2) // For Numerical Types it checks the structural quantities only


    var g = "Techouts"
    var e = "Forword"
    println(g.length)
    println(g.get(4))
    println(g.subSequence(0, 5))
    println(g.compareTo(e))

    //  Raw Stirng
    var s = "HI \" Manoj \" \b " +
            "" +
            "" +
            "How are you?" // Everything prints in a single line
    println(s)
    //MultiLine String it prints as it is how you define !!
    var string12 = """ Hi 
        | Manoj
        | Whats'up ??
    """.trimMargin()

    println(string12)






}