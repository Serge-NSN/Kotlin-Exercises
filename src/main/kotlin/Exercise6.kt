// Calculate 10!
fun main() {
    var i: Int = 1
    var ans: Int =1
    while(i<11){
        ans *= i
        i++
    }
    println("10! = $ans")
}