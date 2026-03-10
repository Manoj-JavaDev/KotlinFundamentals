package oops

sealed class Fruit
// sealed keyword is used to control the inheritance . .. It's subclasses should be in same file
// It is used in place of ENUM
class Apple : Fruit()
class Mango : Fruit()
class Pomegranate : Fruit()

fun describe(fruit: Fruit) {
    when (fruit) {
        is Apple -> println("Apple is good for iron")
        is Mango -> println("Mango is delicious")
        is Pomegranate -> println("Pomegranate is good for vitamin D")
        //else -> {println("Unknown fruit")}
    }
}

fun main() {
    describe(Apple())
    describe(Mango())
    describe(Pomegranate())
}