package week4

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.WordSpec

class ForExpressionTests extends WordSpec with ShouldMatchers {

    "My for-expression" should {
        "yield only odd numbers from a range" in {
        	val xs = Range(0, 10)
        	val res = for {
        	    x <- xs
        	    if x % 2 > 0 
        	} yield x
        	
        	res should be (List(1, 3, 5, 7, 9))
        }
    }
}