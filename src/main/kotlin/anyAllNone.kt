class anyAllNone {
}

fun main(){

    val numbers = listOf(1, -2, 3, -4, 5, -6)
//    val anyNegative = numbers.any {it < 0}
//
//    val anyGT6 = numbers.any { it > 6}


    val allEven = numbers.all { it % 2 == 0}
    val allLess6 = numbers.all { it < 6}


    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1

    val first = words.find { it.startsWith("some") }
    val last = words.findLast { it.startsWith("some") }

    val nothing = words.find { it.contains("nothing") }





}
