// Calculate the average of the numbers in an array of numbers

fun avgOfArrayElements(array: Array<Int>): Int{
    var sum: Int = 0
    for (elt in array){
        sum+=elt
    }
    return sum/array.size
}

fun main() {
    println(avgOfArrayElements(arrayOf(2,0,10,8)))
}