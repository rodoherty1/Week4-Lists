package week4

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.WordSpec

class HigherOrderListFunctionsTest extends WordSpec with ShouldMatchers {
    trait fixture {
        val l = List ("a", "a", "a", "b", "b", "c", "d", "d")
    }
    "Higher Order List Functions" should {
        "dropwhile" in {
            new fixture {
                l.dropWhile(_ equals ("a")) should be (List("b", "b", "c", "d", "d"))
            } 
        }
        
        """filter - Return a list where all elements are equal to "b"""" in {
            new fixture {
                l.filter(_ equals ("b")) should be (List("b", "b"))
            } 
        }        

        // Combines filter and filterNot
        "partition - Return two lists where the first matches the filter criteria and the second does not" in {
            new fixture {
            	val res = l.partition(_ equals ("d"))
            	res._1 should be (List("d", "d"))
            	res._2 should be (List("a", "a", "a", "b", "b", "c"))
            } 
        }   
        
        "takeWhile" in {
            new fixture {
                l.takeWhile(_ < "c") should be (List("a", "a", "a", "b", "b"))
            }
        } 
        
        // Combines takeWhile and dropWhile
        "span" in {
            new fixture {
                val res = l.span(_ < "c")
                res._1 should be (List("a", "a", "a", "b", "b"))
                res._2 should be (List("c", "d", "d"))
            }
        }
    }

}