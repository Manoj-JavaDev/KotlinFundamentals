package oops


fun main() {
    var ballon = BallonImpl()
    println(ballon.color)
    println(ballon.name)
    println(ballon.price)
    ballon.show()

}

abstract class Ballon{
    abstract val name: String

    val color : String = "Blue"

    abstract val price : Int ;

    open fun show() {
        println("This is Show() in  Ballon class")
    }

    abstract fun getColor() ;

}

class BallonImpl : Ballon(){
    override val name = "Ballon-A"
    override val price = 100
    override fun getColor() {
        println("The Color of the Ballon is $color")
    }

    override fun show() {
        println("This is Show() in  BallonImpl class")
    }

}