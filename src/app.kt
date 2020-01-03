//data class Person(val name: String,
//                  val age: Int? = null)
//
//fun add(a: Int, b: Int): Int {
//    return a + b
//}
//
//fun printText(){
//    println("FROM FUNCTIONNNN")
//}
//
//fun main (args : Array<String>) {
//    val persons = listOf(
//        Person("Alice"),
//        Person("Bob", age = 29)
//    )
//
//    val oldest = persons.maxBy { it.age ?: 0 }
//
//    println("The oldest is: $oldest")
//
//    println("a plus b is: ${add(5,6)}")
//
//    printText()
//}
//
//fun main(args: Array<String>){
//    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
//    println("Hello, $name!")
//
//    println("Hello, ${if (args.isNotEmpty()) args[0] else "Kotlin"}!")
//}

// package practicingKotlin

//class Person(val name: String, var isMarried: Boolean){
//
//    // custom getter, since we are describing the properties, can also think of it as the state of the class
//    val isAndrewAndMarried: Boolean
//        get(){
//            return name == "Andrew" && isMarried;
//        }
//
//    fun work(){
//        println("work function")
//    }
//}
//
//fun main(){
//    val p1 = Person("Andrew", false)
//
//    p1.isMarried = true
//    println("Is ${p1.name} married?: ${p1.isMarried}")
//
//    println("Is this andrew?: ${p1.isAndrewAndMarried}")
//
//    p1.work()
//}

import java.util.Random

class Rectangle(val height: Int, val width: Int){
    // Think of it as the state of the class.
    val isSquare: Boolean
        get() = height == width

    override fun toString():String{
        return "height: $height, width: $width"
    }
}

fun randRectangle() : Rectangle{
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun main(){
    val r1 = Rectangle(5,6)
    val r2 = randRectangle()

    println(r1.width)
    println("r1 is: $r1 \nr2 is: $r2")
}
