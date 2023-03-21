// Find the maximum number in an array of numbers
fun maxNum(array: Array<Int>): Int{
    var maxNum: Int = array[0]
    for (elt in array){
        if (elt > maxNum){
            maxNum = elt
        }
    }
    return maxNum
}

fun main() {
    var testArray: Array<Int> = arrayOf(7,2,-4,13,9)
    println(maxNum(testArray))
}