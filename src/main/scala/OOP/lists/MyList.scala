package OOP.lists

abstract class MyList[A] {
  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add(element: A): MyList[A]
  def printElements: String
  def remove(element: A): MyList[A]
  override def toString: String = "[" + printElements + "]"
}
