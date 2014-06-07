package week4

class Cons[T] (val head: T, val tail: MyList[T]) extends MyList[T] {
	def isEmpty = false
}