package coroutines
import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds

// If we want to run suspend function in non- suspending code then we will use runBlocking which creates
// coroutine which executes suspended code and stops the current thread until it completes execution of that block
 fun main()  = runBlocking{

    println(printHello())
    println(printHello2())

}

suspend fun printHello() : String{
    delay(1.seconds)
    return "Hello Kotlin!!"
}
suspend fun printHello2() : String{
    delay(1.seconds)
    return "Hello World!!"
}