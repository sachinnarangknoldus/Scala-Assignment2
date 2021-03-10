class QueueImplement(var list: List[Any] = List()) {

  /**
   * Method to add element to the queue.
   * @param element : Element of the type Any.
   * @return list : A list of the type Any.
   */
  def enqueue(element: Any): List[Any] = {
    list = element :: list
    list
  }

  /**
   * Method to remove the front element of the queue.
   * @param List[Any]
   * @return List
   */
  def deque: List[Any] = {
    list = list.dropRight(1)
    list
  }

  /**
   * Method to return the front element of the queue.
   * @return Any
   */
  def front: Any = {
    list.last
  }

  /**
   * Method to return the last element of the queue.
   * @return Any
   */
  def rear: Any = {
    list.head
  }

  /**
   * Method to check if the queue is empty or not.
   * @return Boolean
   */
  def checkEmpty(): Boolean = {
    list match {
      case Nil => true
      case _ => false
    }
  }

  /**
   * Method to print the contents of the queue.
   */
  def print(): Unit = {
    println(list)
  }
}

object QueueImplementObj extends App {
  val obj = new QueueImplement
  obj.enqueue(1)
  obj.enqueue(3)
  obj.enqueue(4)
  obj.print()
  obj.deque
  obj.print()
  println(obj.rear)
  println(obj.front)
  println(obj.checkEmpty())
}
