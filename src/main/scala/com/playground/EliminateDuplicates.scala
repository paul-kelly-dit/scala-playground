package com.playground

object EliminateDuplicates extends App {

  /*
  https://www.thedigitalcatonline.com/blog/2015/04/07/99-scala-problems-08-eliminate-consecutive-duplicates/

  scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

  */

  def compress[String](l: List[String]):List[String] = l.foldLeft(List[String]()) {
    case (List(), e) => List(e)
    case (ls, e) if (ls.last == e) => ls
    case (ls, e) => ls:::List(e)
  }

  def compressOther[String](l: List[String]):List[String] = l.foldLeft(List[String]()) {
    case (ls, e) if (ls.isEmpty || ls.last != e) => ls:::List(e)
    case (ls, e) => ls
  }

  println("compress should be List('a, 'b, 'c, 'a, 'd, 'e) : " + compress(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")))
}

