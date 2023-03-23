import kotlin.math.roundToInt
import kotlin.math.roundToLong

class Classroom(){
//    var students: Int = 20

    fun benchedNeeded(students: Int =20):Int{
        return (students.toFloat()/3).roundToInt()
    }
}

fun main() {
    var f1 = Classroom()
    println(f1.benchedNeeded())
}