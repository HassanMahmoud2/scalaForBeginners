package OOP.lists
class Empty[A] extends MyList[A] {
  def head: A = throw new NoSuchElementException
  def tail: MyList[A] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(element: A): MyList[A] = new LinkedList(element, new Empty[A])
  def printElements: String = ""
  override def remove(element: A): MyList[A] = throw new NoSuchElementException
}
