// Create a function that will receive two arrays and will return an array with
//elements that are in the first array but not in the second

fun eltInOnlyFirstArray(arr1: Array<Int>, arr2: Array<Int>): MutableList<Int>{
    var found = mutableListOf<Int>()
    for (elt in arr1){
        if (elt !in arr2){
            found.add(elt)
        }
    }
    return found
}

fun main() {
    println(eltInOnlyFirstArray(arrayOf(1,5,6,12), arrayOf(1,2,3,4,6)))
}