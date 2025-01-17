```scala
class MyClass[T](val value: T) {
  def getValue: T = value
}

object Main extends App {
  val myInt = new MyClass(10)
  val myString = new MyClass("hello")

  println(myInt.getValue)
  println(myString.getValue)

  //Error prone code
  val myList = List(myInt, myString)
  println(myList.map(_.getValue))
}
```