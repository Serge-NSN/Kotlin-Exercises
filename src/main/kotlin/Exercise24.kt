// Create a function that will merge two arrays and return the result as a new
//array

fun mergeArrays(arr1: Array<Int>, arr2: Array<Int>) = println((arr1 + arr2).toList())

fun main() {
    mergeArrays(arrayOf(1,2,3), arrayOf(4,5,6))
}