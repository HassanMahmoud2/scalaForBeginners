package functionalPrograming

object functions extends App{
    //1. generate all possible combinations between the following lists
    val charList = List('a', 'b', 'c', 'd')
    val stringList = List("Hassan", "Ahmed", "Omar")
    val intList = List(1, 2, 3)
    val combination = intList.flatMap(n => charList.flatMap(c => stringList.map(s => "" + c + s + n)))
    println(combination)

    //another way
    val forCombination = for {
      n <- intList
      c <- charList
      s <- stringList
  } yield "" + c + s + n
  println(forCombination)

    //2. filter the values in the following list to get only even numbers
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val evenNumbers = numbers.filter(_ % 2 == 0)
    println(evenNumbers)
}
