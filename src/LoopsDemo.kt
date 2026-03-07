

fun main() {

    var arr1 = arrayOf<Int>(1, 2, 3, 4, 5)

    // Item wise printed without Index
    for(number in arr1) {
        println(number)
    }

    // downTo is a keyword that helps to iterate in reverse Order
    // step represents the stepSize of every iteration
    for (i in 7 downTo 1 step 2) {
        print("$i ")
    }
    println()

    // we Can also iterate over a array with its index and value at a same time
    for ((index, value) in arr1.withIndex()) {
        println("arr[$index] =  $value")
    }

}