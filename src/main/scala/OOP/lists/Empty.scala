package OOP.lists

object Empty extends MyList{
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(element: Int): MyList = new LinkedList(element, Empty)
  def printElements: String = ""
}
