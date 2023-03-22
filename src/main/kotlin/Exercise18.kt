// Print the first 100 prime numbers

fun main() {
    var num:Int = 0
    while(num<100){
        if(isPrime(num)){
            println(num)
            num++
        }
        else{
            num++
        }
    }
//println(isPrime(10))

}