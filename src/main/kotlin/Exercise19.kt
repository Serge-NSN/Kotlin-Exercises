// Create a function that will return in an array the first “p” prime numbers
//greater than “n”
fun arrOfFirstPGreaterThanP(p: Int, n: Int): MutableList<Int> {
    var nn = n+1
    var ans = mutableListOf<Int>()
    while(ans.size<p){
        if(isPrime(nn)){
            ans.add(nn)
        }
        nn++
    }
    return ans
}

fun main() {
    println(arrOfFirstPGreaterThanP(10,11))
}