package com.playground

object FindTheKthElementInAList extends App {

  def nth(kthElement: Int, values: List[Int]) = {
    def nthInner(values: List[Int], currentIdx: Int):Int = values match {
      case Nil => throw new NoSuchElementException
      case h :: t => if (kthElement == currentIdx) h else nthInner(t, currentIdx + 1)
    }
    nthInner(values, 0)
  }
  println("Should be 2: " + nth(2, List(1, 1, 2, 3, 5, 8)))
}
