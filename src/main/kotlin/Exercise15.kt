// Create a function that will find the nth Fibonacci number using recursion
fun nFibonacci(n: Int): Int{
    if (n==0){
        return 1
    }
    else if (n==1){
        return 1
    }
    else{
        return n + nFibonacci(n-1)
    }
}

fun main() {
    println(nFibonacci(11))
}