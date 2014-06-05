package week4.util


object RemoveAt {

	def removeAt[T] (n: Int, xs: List[T]): List[T] = {
	  (xs take n) ::: (xs drop n+1)
	}
}