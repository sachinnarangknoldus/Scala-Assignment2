class StackImplementTest extends org.scalatest.flatspec.AnyFlatSpec {
  val instance = new StackImplement(List(2,3,4))

  "If we use push method it " should "push that element in the stack and return the stack" in {
    assert(instance.push(5)===List(5,2,3,4))
  }

  "If we use pop method it " should "remove the element in the last and return remaining stack" in {
    assert(instance.pop===List(3,4))
  }

  "If we use peek method it " should "return the top element of the stack" in {
    assert(instance.peek===2)
  }

  "If we use checkEmpty method it " should "return false if the stack is not empty" in {
    assert(instance.checkEmpty()===false)
  }

  "If we use checkEmpty method it " should "return true if the stack is empty" in {
    assert(instance.checkEmpty()===true)
  }

  val instanceNew = new StackImplement(List())

  "If we use peek method if the queue is empty it" should "return exception" in {
    assertThrows[NoSuchElementException]{
      instanceNew.peek
    }
  }

}
