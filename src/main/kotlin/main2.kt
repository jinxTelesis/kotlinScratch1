fun main(args: Array<String>) {


}


class MutableStack<E>(vararg items: E){

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size -1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

enum class State{
    IDLE, RUNNING, FINISHED
}

//fun main(){
//    val state = State.RUNNING
//    val message = when (state){
//        State.IDLE -> "It's idle"
//        State.RUNNING -> "It's running"
//        State.FINISHED -> "it's finished"
//    }
//}
