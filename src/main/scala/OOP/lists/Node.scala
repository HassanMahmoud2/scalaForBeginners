package OOP.lists

sealed class Node[T](var data: T, var next: Node[T]) {
  def getData: T = this.data
  def getNext: Node[T] = this.next;
}