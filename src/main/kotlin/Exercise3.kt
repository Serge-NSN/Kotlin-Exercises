// Print the multiplication table with 7
fun main() {
    var i: Int = 1
    while(i<8){
        var j: Int = 1
        while(j<13){
            var ans: Int = i * j
            println("$i * $j = $ans")
            j++
        }
        println("-------")
        i++
    }
}