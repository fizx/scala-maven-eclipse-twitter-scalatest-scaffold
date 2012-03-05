package com.twitter

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable._

@RunWith(classOf[JUnitRunner])
class ExampleTest extends FunSuite {

  test("pop is invoked on a non-empty stack") {
    // need to use the mutable Stack class
    var stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    val oldSize = stack.size
    val result = stack.pop
    assert(result === 2)
    assert(stack.size === oldSize - 1)
  }

  test("pop is invoked on an empty stack") {
    val emptyStack = new Stack[Int]
    intercept[NoSuchElementException] {
      emptyStack.pop
    }
    assert(emptyStack.isEmpty)
  }
}