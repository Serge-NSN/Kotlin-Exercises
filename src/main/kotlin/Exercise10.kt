// Calculate the sum of numbers in an array of numbers

fun sumOfArrayElements(array: Array<Int>): Int{
    var ans: Int = 0
    for (elt in array){
        ans+=elt
    }
    return ans
}

fun main() {
    println(sumOfArrayElements(arrayOf(2,0,6,2,-6)))
}