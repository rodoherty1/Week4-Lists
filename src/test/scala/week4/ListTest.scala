package week4

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSpec
import org.scalatest.WordSpec

class ListTest extends WordSpec with ShouldMatchers {
  "An empty list" should {
    "Be empty when it is created" in {
      List().isEmpty should be(true)
    }

    "throw a NoSuchElementException when head is called" in {
      intercept[NoSuchElementException] {
        List().head
      }
    }
    
    "throw a NoSuchElementException when tail is called" in {
      intercept[NoSuchElementException] {
        List().tail
      }
    }
  }
  
  "A new list with 1 element should return its head" in {
    List(1).head should be (1)
  }

  "A new list with 1 element should not be empty" in {
    List(1).isEmpty should be (false)
  }

}