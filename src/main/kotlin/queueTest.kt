import Queue
fun main() {
    var myQueue = Queue()
    myQueue.maxSize = 5
    myQueue.enqueue(2)
    myQueue.enqueue(4)
    myQueue.enqueue(6)
    myQueue.enqueue(8)
    myQueue.enqueue(10)
    myQueue.enqueue(12)
    myQueue.dequeue()
    myQueue.dequeue()
    myQueue.dequeue()
    myQueue.dequeue()
    myQueue.dequeue()
    myQueue.dequeue()
    println(myQueue.queue)

}