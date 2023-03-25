fun arrOfDistinctElements(arr: Array<Int>): MutableList<Int>{
    var arrCopy = arr.toMutableList()
    var ans = mutableListOf<Int>()
    for (elt in arrCopy) {
        if (elt !in ans){
            ans.add(elt)
        }
    }
    return ans
}

fun main() {
    println(arrOfDistinctElements(arrayOf(2,3,1,2,4,6,3)))
}