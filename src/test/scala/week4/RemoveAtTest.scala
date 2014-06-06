package week4

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.WordSpec


class RemoveAtTest extends WordSpec with ShouldMatchers {

	"RemoveAt" should {
		"RemoveAt should remove an element at index n from a List[T]" in {
			val xs = List(1, 2, 3)
			val ys = RemoveAt.removeAt(0, xs)
			ys should have length(2)
			ys should (contain (2) and contain (3))
			ys should not contain (1)
			ys should ((contain (2) and contain (3)) and not contain (1))
		}
		
		"RemoveAT should return an empty list when passed an Empty List" in {
		  val xs = List()
		  RemoveAt.removeAt(1, xs) should have length(0)
		}
	}

}