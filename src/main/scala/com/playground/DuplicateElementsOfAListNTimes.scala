package com.playground

object DuplicateElementsOfAListNTimes extends App {

/*
Duplicate the elements of a list a given number of times.

scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
 */

  def duplicateN[A](count: Int, values: List[A]): List[A] = {
    def duplicateNInner[A](values: List[A], acc: List[A]): List[A] = values match {
      case Nil => acc
      case h :: t => duplicateNInner(t, List.fill(count)(h) ::: acc)
    }
    duplicateNInner(values, Nil)
  }
  println("duplicateN:" + duplicateN(3, List("a", "b", "c", "c", "d")))
}
