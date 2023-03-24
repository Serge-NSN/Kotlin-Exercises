// Rotate an array to the right 1 position
fun rotateToRight1Position(arr: Array<Int>): MutableList<Int>{
    var arrList = arr.toMutableList()
    var right = arrList.removeAt(arr.size-1)
    arrList.add(0, right)
    return arrList
}

fun main() {
    println(rotateToRight1Position(arrayOf(1,2,3,4)))
}