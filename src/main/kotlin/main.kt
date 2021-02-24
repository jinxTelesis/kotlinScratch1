fun main(args: Array<String>) {


//    infix fun Int.times(str: String) = str.repeat(this)
//    print(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String)= Pair(this, other)
    val myPair = "McLaren" onto "Lucus"

    val sophia = Person("Sophina")
    val claudia = Person("claudia")

    sophia likes claudia

    operator fun Int.times (str: String) = str.repeat(this)
    println(2 * "Bye ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; Nothing annoys them so much"

    println(str[0..14])
}

fun printAll(vararg messages: String){
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String){
    for (m in messages) println(prefix + m)
}



class Person(val name: String){
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {likedPeople.add(other)}

}