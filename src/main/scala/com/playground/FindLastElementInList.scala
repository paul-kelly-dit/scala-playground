package com.playground

object FindLastElementInList extends App {

  /*
  from https://www.thedigitalcatonline.com/blog/2015/04/07/99-scala-problems-01-find-last-element/
  scala> last(List(1, 1, 2, 3, 5, 8))
  res0: Int = 8
  */

  def last(values: List[Int]): Int = {
    def lastInner(values: List[Int], last: Int): Int = values match {
      case Nil => last
      case h :: t => lastInner(t, h)
    }
    lastInner(values, 0)
  }

  println(last(List(1, 1, 2, 3, 5, 8)))
}
