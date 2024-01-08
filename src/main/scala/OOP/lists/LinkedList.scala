package OOP.lists

import scala.language.postfixOps

class LinkedList[A](var h: A, var t: MyList[A]) extends MyList[A] {
  override def head: A = h
  override def tail: MyList[A] = t
  override def isEmpty: Boolean = false
  override def add(element: A): MyList[A] = {
    if (tail isEmpty) {
      new LinkedList(head, new LinkedList(element, new Empty))
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
  override def remove(element: A): MyList[A] = {
    if(head == element && tail.isEmpty)
      new Empty
    else if(head == element) {
      new LinkedList(tail.head, tail.tail)
    } else {
      new LinkedList(head, tail.remove(element))
    }
  }
}
