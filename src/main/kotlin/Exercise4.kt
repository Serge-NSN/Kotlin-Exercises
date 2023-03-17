// Print all the multiplication tables with numbers from 1 to 10
fun main() {
    var i: Int = 1
    while (i<11){
        var j: Int = 1
        while(j<13){
            var ans: Int = i * j
            println("$i * $j = $ans")
            j++
        }
        println("")
        i++
    }
}