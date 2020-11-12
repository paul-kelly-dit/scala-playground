package com.playground

object RunLengthEncodingOfAList extends App {

  /*

  scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

  */

  def encodeDirect[A](l: List[A]):List[(Int, A)] = {
    def _encodeDirect(res: List[(Int, A)], rem: List[A]):List[(Int, A)] = rem match {
      case Nil => res
      case ls => {
        val (s, r) = rem span { _ == rem.head }
        _encodeDirect(res:::List((s.length, s.head)), r)
      }
    }
    _encodeDirect(List(), l)
  }

}

