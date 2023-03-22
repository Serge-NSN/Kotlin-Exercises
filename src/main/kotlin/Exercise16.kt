import kotlin.math.sqrt

// Create a function that will return a Boolean specifying if a number is prime

fun isPrime(n: Int): Boolean{
    var ans: Boolean = true
    if(n == 0 || n==1){
        ans = false
    }
    else if(n==2){
        ans = true
    }
    else if(n%2==0){
        ans = false
    }
    else{
        var i: Int = 3
        while(i<= sqrt(n.toFloat())){
            if(n%i==0){
                ans = false
                break
            }
            i+=2
        }
    }
    return ans
}

fun main() {
    println(isPrime(10))
}