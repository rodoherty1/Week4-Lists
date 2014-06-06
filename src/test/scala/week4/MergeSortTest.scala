package week4

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.WordSpec

class MergeSortTest extends WordSpec with ShouldMatchers {
	"My MergeSort algorithm" should {
		"Sort [4, 3, 2, 1] => [1, 2, 3, 4]" in {
			MergeSort(List(4, 3, 2, 1)) should equal (List(1, 2, 3, 4))
		}

		"Sort [4, 3, 2, 1] should not equal [4, 3, 2, 1]" in {
			MergeSort(List(4, 3, 2, 1)) should not equal (List(4, 3, 2, 1))
		}

		"Sort [4] should equal [4]" in {
			MergeSort(List(4)) should equal (List(4))
		}

		"Sort [] should equal []" in {
			MergeSort(List()) should equal (List())
		}
	}
}