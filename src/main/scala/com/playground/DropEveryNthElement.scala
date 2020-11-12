package com.playground

object DropEveryNthElement extends App {
/*
Drop every Nth element from a list.
scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
*/

  def drop(el: Int, values: List[String]): List[String] = {
    val value = values.grouped(el).flatMap { l =>
      l.take(el - 1)
    }.toList
    println("Values : " + value)
    Nil
  }

  def dropRec[A](n: Int, l: List[A]):List[A] = {
    def _dropRec[A](c: Int, res: List[A], rem: List[A]):List[A] = (c, rem) match {
      case (_, Nil) => res
      case (1, _::tail) => _dropRec(n, res, tail)
      case (_, h::tail) => _dropRec(c -1, res:::List(h), tail)
    }
    _dropRec(n, List(), l)
  }

  drop(3, List("a","b","c","d","e","f","g"))
}
