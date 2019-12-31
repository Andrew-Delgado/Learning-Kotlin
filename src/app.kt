data class Person(val name: String,
                  val age: Int? = null)

fun add(a: Int, b: Int): Int {
    return a + b
}

fun printText(){
    println("FROM FUNCTIONNNN")
}

fun main (args : Array<String>) {
    val persons = listOf(
        Person("Alice"),
        Person("Bob", age = 29)
    )

    val oldest = persons.maxBy { it.age ?: 0 }

    println("The oldest is: $oldest")

    println("a plus b is: ${add(5,6)}")

    printText()
}
