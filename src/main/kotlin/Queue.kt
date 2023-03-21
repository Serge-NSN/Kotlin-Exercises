class Queue() {

    var queue: MutableList<Int> = mutableListOf()
    var maxSize: Int = 0
    fun isEmpty(): Boolean{
        return queue.isEmpty()
    }
    fun enqueue(element: Int){
        if(queue.size < maxSize){
            queue.add(element)
            println(queue)
        }
        else{
            println("Queue is full")
        }

    }
    fun dequeue(){
        if(queue.isEmpty()){
            println("Cannot Dequeue, Queue is empty!")
        }
        else{
            queue.removeAt(0)
            println(queue)
        }
    }
     fun peek(){
        if (queue.isEmpty()){
            println("Queue is empty")
        }
        else{
            println(queue.elementAt(queue.size - 1))
        }

    }
}

