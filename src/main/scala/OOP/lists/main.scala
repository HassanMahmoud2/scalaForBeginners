package OOP.lists

object main extends App {
  var linkedList : MyList = new LinkedList(1, new LinkedList(2, new LinkedList(3, Empty)))
  linkedList = linkedList.add(4)
  println(linkedList.toString)
  println(linkedList.remove(5))
}
