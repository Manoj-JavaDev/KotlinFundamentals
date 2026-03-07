fun main()
{
    // Creating an array using arrayOf()
    val arrayname = arrayOf(1, 2, 3, 4, 5)
    for (i in 0..arrayname.size-1)
    {
        print(" "+arrayname[i])
    }
    println()
    //  Creating an array using arrayOf<Int>
    val arrayname2 = arrayOf<Int>(10, 20, 30, 40, 50)
    for (i in 0..arrayname2.size-1)
    {
        print(" "+arrayname2[i])
    }

    println()
    arrayname.set(1,100) // Set Helps to modify the value in an array with its index value and array value
    println(arrayname) // prints array object

    println(arrayname.toString()) // It is also prints array Object
    println(arrayname.contentToString()) // It prints an array

    var arr = Array(5, { i -> (i * i) }) //First parameter is about size and next is lambda function to initalize the array.

    println(arr.contentToString())






}