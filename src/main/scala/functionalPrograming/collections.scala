package functionalPrograming

import scala.collection.mutable.ArrayBuffer

/***** LESSON 3: THE COLLECTIONS *****/
object collections extends App{

  /** 1. ArrayBuffer: an indexed, mutable sequence  **/
  val arrayBuffer = ArrayBuffer(1, 2, 3)        // ArrayBuffer(1, 2, 3)
  arrayBuffer += 4                              // ArrayBuffer(1, 2, 3, 4)
  arrayBuffer += 5 += 6                         // ArrayBuffer(1, 2, 3, 4, 5, 6)
  arrayBuffer.append(7)                         // ArrayBuffer(1, 2, 3, 4, 5, 6, 7)
  arrayBuffer.appendAll(Seq(8, 9))              // ArrayBuffer(1, 2, 3, 4, 5, 6, 8, 9)
  arrayBuffer.clear                             // ArrayBuffer()
  arrayBuffer += 1                              // ArrayBuffer(1)
  arrayBuffer.insert(0, 8)                       // ArrayBuffer(8, 1)
  arrayBuffer.insertAll(0, Vector(4, 5, 6, 7))   // ArrayBuffer(4, 5, 6, 7, 8, 1)
  arrayBuffer.prepend(3)                         // ArrayBuffer(3, 4, 5, 6, 7, 8, 1)
  arrayBuffer.prependAll(Array(0, 1, 2))         // ArrayBuffer(0, 1, 2, 3, 4, 5, 6, 7, 8, 1)
  val arrayBuffer2 = ArrayBuffer.range('a', 'h')  // ArrayBuffer(a, b, c, d, e, f, g)
  arrayBuffer2.remove(0)                          // ArrayBuffer(b, c, d, e, f, g)
  arrayBuffer2.remove(2, 3)                       // ArrayBuffer(b, c, g)
  val arrayBuffer3 = ArrayBuffer.range('a', 'h')  // ArrayBuffer(a, b, c, d, e, f, g)
  arrayBuffer3.dropInPlace(2)                     // ArrayBuffer(c, d, e, f, g)
  arrayBuffer3.dropRightInPlace(2)                // ArrayBuffer(c, d, e)

  /** 2. List: a linear (linked list), immutable sequence
   * its a single linkedlist so you can use prepend only
  **/
  val list = List(1, 2, 3)            // List(1, 2, 3)
  val newList = list:++ List(4,5)     // List(1, 2, 3, 4, 5)

  /** 3. Vector: an indexed, immutable sequence
   * its not single linked list like list so you can use append and prepend
  **/
  val vector = Vector(1, 2, 3)
  val newVector = vector :+ 4

  /** 4. Map:	the base Map (key/value pairs) class **/

  /** 5. Set:	the base Set class **/

}
