package problemSolving

object Solution extends App{

  def canThreePartsEqualSum(arr: Array[Int]): Boolean = {
    val sum = arr.sum
    val eachSum = sum / 3
    def findPartitions(index: Int, accumulativeSum: Int, partitions: Int): Boolean = {
      if(index == arr.length) {
        partitions == 3
      } else {
        val newAccumulativeSum = accumulativeSum + arr(index)
        if(newAccumulativeSum == eachSum && partitions < 3) {
          findPartitions(index + 1, 0, partitions + 1)
        } else {
          findPartitions(index + 1, newAccumulativeSum, partitions)
        }
      }
    }
    sum % 3 == 0 && findPartitions(0, 0, 0)
  }
  val arr = Array[Int](0,0,0,0)
  println(canThreePartsEqualSum(arr))
}