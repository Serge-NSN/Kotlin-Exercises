import kotlin.math.roundToInt
import kotlin.math.roundToLong

class Classroom(){
    var students: List<String> = listOf("John", "Peter", "Mary", "Suh", "Ngwa", "Che", "Siri", "Njong", "Feh", "Helen", "Paul", "Obi", "Lynn", "Ambe", "Nelson", "Joshua", "Emma", "Serge", "Anna", "Faith")

    fun benchesNeeded():Int{
        return (students.size.toFloat()/3).roundToInt()
    }

    fun displayPositions(){
        var benchNum = 1
        var j = 0
        var k = 0
        while(benchNum<benchesNeeded()+1){
            print("Bench $benchNum: ")
            while(j<3){
                print(students[k] + " ")
                j++
                k++
            }
            j=0
            println("")
            benchNum++
        }

        }
}

fun main() {
    var f1 = Classroom()
//    println(f1.benchesNeeded())
    println(f1.displayPositions())

}