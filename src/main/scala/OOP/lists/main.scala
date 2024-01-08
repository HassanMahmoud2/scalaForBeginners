package OOP.lists

object main extends App {

  var intLinkedList : MyList[Int] = new LinkedList(1, new LinkedList(2, new LinkedList(3, new Empty)))
  intLinkedList = intLinkedList.add(4)
  println(intLinkedList.toString)
  println(intLinkedList.remove(2))

  var stringLinkedList : MyList[String] = new LinkedList("Hassan", new LinkedList("Khalifa", new LinkedList("Aliaa", new Empty)))
  stringLinkedList = stringLinkedList.add("Omar")
  println(stringLinkedList.toString)
  println(stringLinkedList.remove("Hassan"))
}
