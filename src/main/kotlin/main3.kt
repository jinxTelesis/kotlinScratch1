
sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)

class Human(val humanName: String, val job: String): Mammal(humanName)


fun greetMammal(mammal: Mammal): String{
    when(mammal){
        is Human -> return "Hello ${mammal.name}";
        is Cat -> return "Hello ${mammal.name}";
    }
}


//fun main(){
//
//}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {

    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special
}

object DoAUth{
    fun takeParams(username: String, password: String){
        println("input Auth parameters = $username:$password")
    }
}

class BigBen{
    companion object Bonger{
        fun getBongs(nTimes: Int){
            for (i in 1 .. nTimes){
                println("BONG ")
            }
        }
    }
}