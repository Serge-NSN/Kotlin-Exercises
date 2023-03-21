class Queue(var queue: MutableList<Int>) {

    fun isEmpty(): Boolean{
        return queue.isEmpty()
    }
    fun enqueue(element: Int){
        queue.add(element)
        println(queue)
    }
    fun dequeue(){
        if(queue.isEmpty()){
            println("Queue is empty")
        }
        else{
            queue.removeAt(0)
            println(queue)
        }
    }
    fun peek(){
        println(queue.elementAt(queue.size - 1))
    }
}

