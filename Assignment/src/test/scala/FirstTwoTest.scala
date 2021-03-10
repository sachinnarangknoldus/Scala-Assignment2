class FirstTwoTest extends org.scalatest.flatspec.AnyFlatSpec {
  val instance=new FirstTwo

  //Testcases for the 1st Question

  "If we pass List(1,2,3) then it " should "return 3 (The last value) and 2 (which is the index value)" in {
    assert(instance.lastElement(List(1,2,3))===(3,2))
  }

  "If we pass an empty list the it " should "return () (Unit) and -1 (which is the index value)" in {
    assert(instance.lastElement(List())===((),-1))
  }

  "If we pass List(2,3,4,5,6) then it " should "return 6 (The last value) and 4 (which is the index value)" in {
    assert(instance.lastElement(List(2,3,4,5,6))===(6,2))
  }

}
