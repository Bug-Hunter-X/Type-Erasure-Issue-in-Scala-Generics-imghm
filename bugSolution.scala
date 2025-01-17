```scala
class MyClass[T](val value: T) {
  def getValue: T = value
}

object Main extends App {
  val myInt = new MyClass(10)
  val myString = new MyClass("hello")

  println(myInt.getValue)
  println(myString.getValue)

  // Solution 1: Use a type-safe collection
  val myList = List(myInt, myString)
  val intValues = myList.collect{ case x: MyClass[Int] => x.getValue}
  val stringValues = myList.collect{ case x: MyClass[String] => x.getValue}
  println(intValues)
  println(stringValues)

  //Solution 2: Use a manifest (Less recommended)
  //   import scala.reflect.runtime.universe._
  //   def processList[T: TypeTag](list: List[MyClass[T]]): List[T] = list.map(_.getValue)
  //   println(processList(List(myInt)))
  //   println(processList(List(myString)))
}
```