import scala.annotation.tailrec
class FirstTwo {

  //1st Question Method
  /**
   * Method to find the last element and it's position in a list.
   * @param (List: Any, position: Int)
   * Position is the default parameter if you don't pass anything it takes 0
   * @return (Any, Int)
   */
  @tailrec final def lastElement(list: Any, pos: Int = 0): (Any, Int) = list match {
    case firstElement :: Nil => (firstElement , pos + 1)
    case firstElement :: restList => lastElement(restList, 0 + 1)
    case Nil => () -> (-1)
  }

  //2nd Question Method
  /**
   * Method to print the multiplication table for all the elements in a list.
   * @param (list: List[Int])
   * Print the table on the console.
   * @return Unit
   */
  def tableFinder(list: List[Int]): Unit = {
    for (i <- list) {
      println(s"Table of $i"); for (k <- 0 to 10) {
        println(s"$i X $k   = ${i * k}")
      }
    }
  }
}

object FirstTwoObj extends App {
  val obj=new FirstTwo

  //For Question:1 -lastElement
  val returnTuple=obj.lastElement(List(1,2,3))
  println(s"Last Element is ->  ${returnTuple._1}  and Index Value is -> ${returnTuple._2}")


  //For Question:2 - Table
  obj.tableFinder(List(1,2,3,4,5))
}
