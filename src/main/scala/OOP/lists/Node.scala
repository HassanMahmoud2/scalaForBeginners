package OOP.lists

sealed class Node[T](var data: T, var next: Node[T]) {
  def getData: T = this.data
  def setData(data: T): Unit = {
    this.data = data
  }
  def getNext: Node[T] = this.next;
  def setNext(next: Node[T]): Unit = {
    this.next = next
  }

}