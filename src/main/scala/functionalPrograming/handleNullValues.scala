package functionalPrograming
object handleNullValues extends App {

  /***** LESSON 1: HOW TO HANDLE NULL VALUES IN SCALA *****/

  /**
   * Scala’s solution to this problem is to use a trio of classes known as Option, Some, and None.
   * The Some and None classes are subclasses of Option, so the solution works like this:
   * Imagine we are creating function that convert string to int
   * so, what if a string can't be converted to int is passed to the function?
   * Here is the Solution:
    * a. declare that toInt returns an Option type
    * b. If toInt receives a string it can convert to an Int, you wrap the Int inside of a Some
    * c. If toInt receives a string it can’t convert, it returns a None
   **/
  def toInt(string: String) : Option[Int] = {
    try {
      Some(Integer.parseInt(string.trim))
    } catch {
      case exception => None
    }
  }

  /**
   * Now let's imagine that you’re a consumer of the toInt method.
   * You know that the method returns a subclass of Option[Int],
   * so the question becomes, how do you work with these return types?
   * There are two main answers:
    * a. Use a match expression
    * b. Use a for/yield expression
    * c. Use a foreach expression
   * 1. "using match expression",
   * if the passed value can be converted to an Int,the first case statement is executed
   * if the value can’t be converted to an Int, the second case statement is executed.
   **/
  val matchResult = toInt("1234") match {
    case Some(intValue) => intValue
    case None => "it can't be converted"
  }

  println("The match result =  " + matchResult)

  /**
   * 2. "using for/yield expression"
   * To demonstrate this, imagine that you want to convert three strings to integer values, and then add them together.
   * The for/yield solution looks like this:
   * The forResult will be one of two things:
   * If all three strings convert to integers, forResult will be a Some[Int], i.e., an integer wrapped inside a Some
   * If any of the three strings can’t be converted to an integer, forResult will be a None
   **/
  val forResult = for {
    a <- toInt("1")
    b <- toInt("2")
    c <- toInt("3")
  } yield a + b + c

  println("The for/yeild result =  " + forResult)
  /**
   * 2. "using foreach expression"
   * it's the easiest way to handle option type as it returns the int if it's converted
   * or return nothing if the string isn't converted
   * since The foreach method on the None class knows that None doesn't contain anything, so it does nothing
   **/
  toInt("hello").foreach(println)
  toInt("1234").foreach(println)
}

