package week4

trait List[T] {
	def isEmpty: Boolean
	def head: T
	def tail: List[T]
}

object List {
	def apply() = new Nil
	def apply[T](x1: T): List[T] = new Cons(x1, new Nil)
	def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2, new Nil))
}