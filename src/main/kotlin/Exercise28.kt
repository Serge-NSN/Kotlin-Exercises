// Calculate the sum of first 100 prime numbers and return them in an array
fun sumOfFirstHundredPrimeNumbers():Int{
    var ans = mutableListOf<Int>()
    var i = 0
    while (ans.size < 100){
        if(isPrime(i)){
            ans.add(i)
        }
        i++
    }
    println(ans)
    return ans.sum()
}

fun main() {
    println(sumOfFirstHundredPrimeNumbers())
}
