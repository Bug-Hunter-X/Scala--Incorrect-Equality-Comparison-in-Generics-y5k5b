```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    if (value.equals(x)) {
      return x
    } else {
      throw new Exception("Values are not equal")
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val myObj = new MyClass[String]("hello")
    try {
      println(myObj.myMethod("hello"))
      println(myObj.myMethod("world"))
    } catch {
      case e: Exception => println(e.getMessage)
    }
  }
}
```