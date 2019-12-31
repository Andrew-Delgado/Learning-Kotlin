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

class Person(val name: String, var isMarried: Boolean){
    val isAndrew: Boolean
        get(){
            return name == "Andrew"
        }
}

fun main(){
    val p1 = Person("Andrew", false)

    p1.isMarried = true
    println("Is ${p1.name} married?: ${p1.isMarried}")

    println("Is this andrew?: ${p1.isAndrew}")
}
