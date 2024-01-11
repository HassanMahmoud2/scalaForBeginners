package problemSolving

object slidingSubarrayBeauty extends App{
  def getSubarrayBeauty(nums: Array[Int], k: Int, x: Int): Array[Int] = {
    (nums.sliding(k).toArray.map(subarray => subarray.filter(_ < 0).sorted))
      .map(arr => arr.lift(x-1).getOrElse(0))
  }
  val nums = Array(-3, 1, 2, -3, 0, -3)
  //val nums = Array(1,-1,-3,-2,3)
  val k = 2
  val x = 1
  getSubarrayBeauty(nums, k , x).foreach(num => print(num + " "))
}
