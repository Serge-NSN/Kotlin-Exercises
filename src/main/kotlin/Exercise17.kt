// Calculate the sum of digits of a positive integer number
fun sumOfDigits(n: Int): Int{
    var ans: Int = 0
    if(n<=0){
        println("Given number is NOT a positive integer")
    }
    else{
        for (char in n.toString()){
            ans += char.digitToInt()
        }

    }
    return ans
}

fun main() {
    println(sumOfDigits(1239))
}