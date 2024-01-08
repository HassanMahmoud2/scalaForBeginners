package OOP.lists

import scala.annotation.tailrec

class LinkedList[T] {

  private var head: Node[T] = null;

  def push(data: T): Unit = {
    if(head == null) {
      head = new Node(data, null)
    } else {
      pushRecursive(head, data)
    }
  }
  @tailrec
  private def pushRecursive(current: Node[T], data: T): Unit = {
    if(current.getNext == null) {
      current setNext new Node[T](data, null)
    } else {
      pushRecursive(current.getNext, data: T)
    }
  }
  def printList(): Unit = {
    print("[")
    if (head != null) {
      print(head.getData)
      printElements(head.getNext)
    }
    println("]")
  }
  @tailrec
  private def printElements(current: Node[T]): Unit = {
    if (current != null) {
      print(", " + current.getData)
      printElements(current.getNext)
    }
  }
  def remove(deleteItem: T): Unit = {
    removeRecursive(head, head, deleteItem)
  }
  @tailrec
  private def removeRecursive(previous: Node[T], current: Node[T], deleteItem: T): Unit = {
    if (current != null) {
      if (current.data.equals(deleteItem)) {
        if (current.equals(previous)) {
          head = current.getNext
        } else {
          previous setNext current.getNext
        }
      } else {
        removeRecursive(current, current.getNext, deleteItem)
      }
    }
  }
  def isEmpty: Boolean = {
    if(head == null) {
      true
    } else {
      false
    }
  }
}





