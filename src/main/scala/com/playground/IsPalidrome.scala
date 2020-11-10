package com.playground

object IsPalidrome extends App {

  // Doing the problems from https://www.thedigitalcatonline.com/blog/2015/04/07/99-scala-problems-06-palindome/

  def isPalindrome[A](l: List[A]):Boolean = l match {
    case Nil => true
    case firstLastMiddle(first, last, rem) => (first == last) && isPalindrome(rem)
  }
  println("Should be true : " + isPalindrome(List(1, 2, 3, 2, 1)))
}

object firstLastMiddle {
  def unapply[A](l: List[A]): Option[(A, A, List[A])] = l match {
    case Nil => None
    case l if (l.length == 1) => Some(l.head, l.last, List())
    case l => Some(l.head, l.last, l.init.tail)
  }
}

//object frl {
//  def unapply[A] (l: List[A]) = l match {
//    case Nil => None
//    case l if (l.length == 1) => Some(l.head, l.last, List())
//    case l => {
//      Some(l.head, l.last, l.init.tail)
//    }
//  }
//}