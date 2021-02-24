
import kotlin.reflect.KProperty

class Example{
    val p: String by Delegate()


}


class Delegate(){
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String{
        return "$thisRef, thank you for delegating '{prop.name}"
    }
}


fun main(){

}



