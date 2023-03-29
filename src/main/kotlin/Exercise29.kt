// Print the distance between the first 100 prime numbers
fun main() {
    var last_prime = 2
    var i = last_prime + 1
    //var found_prime = 1
        while (i<100){
            if(isPrime(i)){
                println("${i - last_prime} -------- ($i - $last_prime)")
                last_prime = i
            }
            i++
    }
}