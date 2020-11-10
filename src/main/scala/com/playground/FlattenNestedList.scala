package com.playground

object FlattenNestedList extends App {

/*
  https://www.thedigitalcatonline.com/blog/2015/04/07/99-scala-problems-07-flatten/

  scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  res0: List[Any] = List(1, 1, 2, 3, 5, 8)

 */
  def flatten[A](values: List[A]): List[A] =  values match {
    case Nil => Nil
    case (h: List[A]) :: t => flatten(h) ::: flatten(t)
    case (h: A) :: t => h :: flatten(t)
  }

  println("List(1, 1, 2, 3, 5, 8): " + flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
}
