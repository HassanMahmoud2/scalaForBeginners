package functionalPrograming

  /***** LESSON 2: COMPANION OBJECTS *****/

/**
 * A companion object is an object that’s declared in the same file as a class, and has the same name as the class
 * A companion object and its class can access each other’s private members
 * A companion object’s apply method lets you create new instances of a class without using the new keyword
 * You can create multiple apply methods in a companion object to provide multiple constructors.
 * The following code shows how to create both one- and two-argument constructors.
 */
class Person {
  var name: Option[String] = None
  var age: Option[Int] = None
  override def toString: String = s"$name, $age"
}

object Person {

  // a one-arg constructor
  def apply(name: Option[String]): Person = {
    var p = new Person
    p.name = name
    p
  }

  // a two-arg constructor
  def apply(name: Option[String], age: Option[Int]): Person = {
    var p = new Person
    p.name = name
    p.age = age
    p
  }
}
object companionObjects extends App {
  val p1 =  Person(Some("Hassan"))
  val p2 = Person(None)
  val p3 = Person(Some("Wilma"), Some(33))
  val p4 = Person(Some("Wilma"), None)
  println(p1 + "    " + p2 + "    " + p3 + "    "  + p4)
}

