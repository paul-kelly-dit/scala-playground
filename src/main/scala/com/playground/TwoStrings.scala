package com.playground

/*
  Given two strings, determine if they share a common substring. A substring may be as small as one character.

  For example, the words "a", "and", "art" share the common substring . The words "be" and "cat" do not share a substring.

  Function Description

  Complete the function twoStrings in the editor below.
  It should return a string, either YES or NO based on whether
  the strings share a common substring.

  twoStrings has the following parameter(s):

  s1, s2: two strings to analyze

  ### Input Format

  The first line contains a single integer , the number of test cases.

  The following  pairs of lines are as follows:

  The first line contains string .
  The second line contains string .

  For each pair of strings, return YES or NO.

  Sample Input

  2
  hello
  world
  hi
  world

  Sample Output

  YES
  NO

*/


object TwoStrings extends App {

//    val input = scala.io.Source.stdin.getLines drop 1

  val input = List("hello", "world", "hi", "world")
  input.grouped(2).foreach { twoLines =>
    val List(str1,str2) = twoLines.toList
    val commonChars = str1.toSet.intersect(str2.toSet)
    if (commonChars.isEmpty) println("NO")
    else println("YES")
  }
}
