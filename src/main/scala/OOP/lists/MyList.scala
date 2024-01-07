package OOP.lists

abstract class MyList {
  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element: Int): MyList
  def printElements: String
  def remove(element: Int): MyList
  override def toString: String = "[" + printElements + "]"
}
