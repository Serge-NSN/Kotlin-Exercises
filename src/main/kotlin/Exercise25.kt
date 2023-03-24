//Create a function that will receive two arrays of numbers as arguments and
//return an array composed of all the numbers that are either in the first array
//or second array but not in both

fun arrayOfUncommonElements(arr1: Array<Int>, arr2: Array<Int>): List<Int>{
    var ans: MutableList<Int> = mutableListOf()
    var arrList1 = arr1.toMutableList()
    var arrList2 = arr2.toMutableList()

        for (elt in arrList1){
            if(elt !in arr2){
                ans.add(elt)
            }
        }

        for (elt in arr2){
            if(elt !in arrList1){
                ans.add(elt)
            }
        }


    return ans
}

fun main() {
    println(arrayOfUncommonElements(arrayOf(2,4,5,6), arrayOf(1,2,3,4,6,9)))
}