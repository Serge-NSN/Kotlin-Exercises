import kotlin.math.sqrt

// Create a function that will return a Boolean specifying if a number is prime

fun isPrime(n: Int): Boolean{
    var ans: Boolean = false
    if(n == 0 || n==1){
        ans = false
    }
    else if(n==2){
        ans = true
    }
    else{
        var i: Int = 3
        while(i<= sqrt(n.toDouble())){
            if(n%i==0){
                i+=2
                ans = false
                break
            }
            else{
                i+=2
                ans = true
            }
        }
    }
    return ans
}

fun main() {
    println(isPrime(131))
}