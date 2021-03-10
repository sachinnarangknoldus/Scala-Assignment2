class QueueImplementTest extends org.scalatest.flatspec.AnyFlatSpec {
  val instance = new QueueImplement(List(2,3,4))

  "If we use enqueue method it " should "push that element in the queue and return the queue" in {
    assert(instance.enqueue(5)===List(5,2,3,4))
  }

  "If we use deque method it " should "remove the element in FIFO order and return remaining queue" in {
    assert(instance.deque===List(2,3))
  }

  "If we use front method it " should "return the front element of the queue" in {
    assert(instance.front===4)
  }

  "If we use rear method it " should "return the last inserted element of the queue" in {
    assert(instance.rear===2)
  }

  "If we use checkEmpty method it " should "return false if the queue is not empty" in {
    assert(instance.checkEmpty()===false)
  }

  "If we use checkEmpty method it " should "return true if the queue is empty" in {
    assert(instance.checkEmpty()!=false)
  }

  val instanceNew = new QueueImplement(List())

  "If we use front method if the queue is empty it" should "return exception" in {
    assertThrows[NoSuchElementException]{
      instanceNew.front
    }
  }

  "If we use return method if the queue is empty it" should "return exception" in {
    assertThrows[NoSuchElementException]{
      instanceNew.rear
    }
  }
}
