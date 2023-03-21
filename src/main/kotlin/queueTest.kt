import Queue
fun main() {
    var myList = Queue(mutableListOf(1,2,3,4,5))
    println(myList.queue)
    myList.enqueue(1)
    myList.dequeue()
    myList.peek()
}