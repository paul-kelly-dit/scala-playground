package com.playground

object FindLastButOneElementInList extends App {

  /*
  from https://www.thedigitalcatonline.com/blog/2015/04/07/99-scala-problems-01-find-last-element/
  scala> last(List(1, 1, 2, 3, 5, 8))
  res0: Int = 8
  */

  def lastButOneInList(values: List[Int]): Int = values match {
      case h :: t :: Nil => h
      case _ :: t => lastButOneInList(t)
      case _ => throw new NoSuchElementException
  }

  println("Should be 5 - " + lastButOneInList(List(1, 1, 2, 3, 5, 8)))
}
