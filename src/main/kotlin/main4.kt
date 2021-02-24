val systemUsers: MutableList<Int> = mutableListOf(1,2,3)
val sudoers: List<Int> = systemUsers


class main4 {
}

const val POINTS_X_PASS: Int = 15

val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100)

val EZPassReport: Map<Int,Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int){
    if (EZPassAccounts.containsKey(accountId)){
        println("Updating $accountId")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS

    }
}
//
//val numbers = listOf(1, -2, 3, -4, 5, -6)
//
//val positives = numbers.filter { x -> x > 0 }
//val negatives = numbers.filter { it < 0 }

val numbers = listOf(1, -2, 3, -4, 5, -6)

val doubled = numbers.map { x -> x * 2 }

val tripled = numbers.map { it * 3 }

