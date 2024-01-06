package OOP

import scala.language.postfixOps

//applying prefix, infix and postfix notations
object firstExercise extends App {

  class Person(val name : String, val food : String, val age : Int) {
    def eats(food: String): Boolean = food == this.food
    def isUnderAge: Boolean = if (age > 18) false else true
    def unary_+ : Person = new Person(name, food, age + 1)
    def apply() : String = s"Hi, my name is $name, I'm $age years old and eating $food"
  }

  val marry = new Person("marry", "spaghetti", 16)

  //infix annotation
  println(marry eats "rice")
  //postfix annotation
  println(marry isUnderAge)
  //prefix annotation
  println((+marry)())
}

