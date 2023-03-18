// Calculate the sum of even numbers greater than 10 and less than 30
fun main() {
    var i: Int = 11
    var ans: Int = 0
    while(i<30){
        if(i%2==0){
            ans += i
            i++
        }
        i++
    }

    println("Sum of even numbers greater than 10 and less than 30 is: $ans")
}