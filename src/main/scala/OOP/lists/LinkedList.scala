package OOP.lists

import scala.language.postfixOps

class LinkedList(var h: Int, var t: MyList) extends MyList {
  override def head: Int = h
  override def tail: MyList = t
  override def isEmpty: Boolean = false
  override def add(element: Int): MyList = {
    if (tail isEmpty) {
      new LinkedList(head, new LinkedList(element, Empty))
    } else {
      new LinkedList(head, tail.add(element))
    }
  }
  def printElements: String = {
    if(t.isEmpty)
      "" + h
    else
      h + " " + t.printElements
  }
}
