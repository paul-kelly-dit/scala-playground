package com.playground

object SplitAListIntoTwoParts extends App {

  /*
  https://www.thedigitalcatonline.com/blog/2015/05/13/99-scala-problems-16-20/

  P17 (*) Split a list into two parts.

  scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
   */

  def split[A](n: Int, l: List[A]): (List[A], List[A]) = l.splitAt(n)

  def splitOther[A](n: Int, l: List[A]): (List[A], List[A]) =
    (l.take(n), l.takeRight(n))

  def splitRecur[A](n: Int, l: List[A]): (List[A], List[A]) = {
    def _split[A](c: Int, res: List[A], rem: List[A]): (List[A], List[A]) = (c, rem) match {
      case (0, _) =>(res, rem)
      case (ctr, h :: t) if (ctr == 1) => (res ::: List(h), t)
      case (ctr, h :: t) => _split(c - 1, res ::: List(h), t)
      case _ => (res, Nil)
    }

    _split(n, List(), l)
  }

  //  private val tuple: (List[Int], List[Int]) = splitOther(3, List(1, 2, 3, 4, 5, 6))
  private val tuple: (List[Int], List[Int]) = splitRecur(3, List(1, 2, 3, 4, 5, 6))
  println(tuple)

}
