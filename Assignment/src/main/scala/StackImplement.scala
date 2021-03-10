class StackImplement(var list: List[Any] = List()) {

  /**
   * Push Method is used to add element to the stack.
   *
   * @param element : Element of the type Any.
   * @return list : A list of the type Any.
   */
  def push(element: Any): List[Any] = {
    list = element :: list
    list
  }

  /**
   * Method to pop the peek element from the stack.
   *
   * @return List
   */
  def pop: List[Any] = {
    list = list.drop(1)
    list
  }

  /**
   * Method to return the peek element of the stack.
   *
   * @return Any
   */
  def peek: Any = {
    list.head
  }

  /**
   * Method to check if the stack is empty or not.
   *
   * @return Boolean
   */
  def checkEmpty(): Boolean = {
    list match {
      case Nil => true
      case _ => false
    }
  }

  /**
   * Prints the content of the stack
   */
  def print(): Unit = {
    println(list)
  }
}

object StackImplementObj extends App {
  val obj = new StackImplement(List(1, 2))
  obj.push(4)
  obj.print()
  obj.pop
  obj.print()
  println(obj.peek)
  println(obj.checkEmpty())
}