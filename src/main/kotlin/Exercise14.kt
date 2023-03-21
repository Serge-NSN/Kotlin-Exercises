// Print the first 10 Fibonacci numbers without recursion
fun main() {
    var i: Int = 0
    var result: MutableList<Int> = mutableListOf()
    var prev: Int = 0
    var next: Int = 1

    while(i<9){
        var ans = prev + next
        result.add(ans)
        i++
        prev = next
        next = ans
    }
    println(mutableListOf(0,1) + result)
}