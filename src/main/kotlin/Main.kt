val name: String  = "Nate"
val greeting: Int?= 46
var nullable: String? = null

fun getGreeting(): String{
    return  "Helllo Kotlin"
}
fun sayHello(){
    println("Merujan")
}
fun main(){
//    println(greeting)
//    println(name)
//    nullable = "Meruj"
//    println(nullable)

//    when(nullable){
//        null -> println("Hey giti sarer")
//        else -> println("Suserov par")
//    }
//    val greetingtoPrint = if(greeting != null) greeting else "HI"
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    val interestingThings = arrayOf("Kotlin", "Programming")
    println(interestingThings[0])
    for(interestingTHing in interestingThings){
        println(interestingThings)
    }
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }
    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }
    val interestingThingsMutable = mutableListOf("Kotlin", "Programming");

    val person = Person()
}
