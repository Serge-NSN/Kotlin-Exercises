// Create a function that receives an array of numbers as argument and returns an
//array containing only the positive numbers
fun arrOfPositiveNumbers(array: Array <Int>): MutableList<Int>{
    var list = array.toMutableList()
    var ans: MutableList<Int> = mutableListOf()
    for (elt in array){
        if (elt > 0){
            ans.add(elt)
        }
    }
    return ans
}

fun main() {
    var myArray: Array <Int> = arrayOf(2,3,5,-6,12,-3,0,7)
    println(arrOfPositiveNumbers(myArray))
}