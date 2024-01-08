package OOP.lists

object main extends App {

  var linkedList: LinkedList[Int] = new LinkedList();
  linkedList.push(1)
  linkedList.push(2)
  linkedList.push(3)
  println("pushed 1 2 3 to the list and here is the list after pushing")
  linkedList.printList()
  println("is the list empty?")
  println(linkedList.isEmpty)
  println("let's empty the list")
  linkedList.remove(3)
  linkedList.remove(1)
  linkedList.remove(2)
  println("the list is empty now, so lets test isEmpty function")
  println(linkedList.isEmpty)

}
