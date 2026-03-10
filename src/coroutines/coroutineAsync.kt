package coroutines
import kotlinx.coroutines.*
import kotlin.random.Random
import kotlin.time.Duration.Companion.milliseconds

suspend fun main()  = withContext(Dispatchers.Default) {

    println("Main Thread Name is ${Thread.currentThread().name}")

    val firstPage = this.async {
        delay(50.milliseconds)
        println("First page Coroutine Name =  ${Thread.currentThread().name}")
        "first_page"
    }

    val secondPage = this.async {
        delay(50.milliseconds)
        println("Second page Coroutine Name =  ${Thread.currentThread().name}")
        "second_page"
    }

    val pagesAreEqual = firstPage.await() == secondPage.await()
    println("First pagesAreEqual = $pagesAreEqual")


}