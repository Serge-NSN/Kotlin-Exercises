// Rotate an array to the left 1 position
fun rotateToLeft1Position(arr: Array<Int>): MutableList<Int> {
    var arrList = arr.toMutableList()
    arrList.removeAt(0)
    arrList.add(arr[0])
    return arrList

}

fun main() {
    println(rotateToLeft1Position(arrayOf(9,2,3,4)))
}