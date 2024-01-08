package OOP.lists

import scala.annotation.tailrec
import scala.util.control.Breaks.break

class LinkedList[T]() {
  var head: Node[T] = null;

  def push(data: T): Unit = {
    if(head == null) {
      head = new Node(data, null)
    } else {
      pushRecursive(head, data)
    }
  }
  @tailrec
  private def pushRecursive(current: Node[T], data: T): Unit = {
    if(current.next == null) {
      current.next = new Node[T](data, null)
    } else {
      pushRecursive(current.next, data: T)
    }
  }

  def printList() = {
    print("[")
    if (head != null) {
      print(head.data)
      printElements(head.next)
    }
    println("]")
  }
  private def printElements(current: Node[T]): Unit = {
    if (current != null) {
      print(", " + current.data)
      printElements(current.next)
    }
  }
  def remove(deleteItem: T): Unit = {
    removeRecursive(head, head, deleteItem)
  }
  private def removeRecursive(previous: Node[T], current: Node[T], deleteItem: T): Unit = {
    if (current != null) {
      if (current.data.equals(deleteItem)) {
        if (current.equals(previous)) {
          head = current.next
        } else {
          previous.next = current.next
        }
      } else {
        removeRecursive(current, current.next, deleteItem)
      }
    }
  }
  def isEmpty(): Boolean = {
    if(head == null) {
      true
    } else {
      false
    }
  }
}





