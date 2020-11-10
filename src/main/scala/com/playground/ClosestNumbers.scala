package com.playground

object ClosestNumbers extends App {
  /*

  Sorting is useful as the first step in many different tasks. The most common task is
  to make finding things easier, but there are other uses as well. In this case, it
  will make it easier to determine which pair or pairs of elements have the smallest absolute
  difference between them.

  For example, if you've got the list , sort it as  to see that several pairs have the
  minimum difference of : . The return array would be .

  Given a list of unsorted integers, , find the pair of elements that have the smallest absolute
  difference between them. If there are multiple pairs, find them all.

Sample input
  10
  -20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854

Sample output
  -20 30
   */

  val readLine = "-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854"

  val n = readLine.toInt
  val nums = readLine.split(" ").map(_.toInt)
  val sortedNums = nums.sorted
  val diffs = (1 until n).map(i => math.abs(sortedNums(i) - sortedNums(i - 1)))
  val minDiff = diffs.min
  val pairs = (0 until n - 1).flatMap { i =>
    if (diffs(i) == minDiff) Some(sortedNums(i) + " " + sortedNums(i + 1))
    else None
  }
  println(pairs.mkString(" "))


}
