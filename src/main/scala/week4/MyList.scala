package week4

trait MyList[T] {
	def isEmpty: Boolean
	def head: T
	def tail: MyList[T]
}

object MyList {
	def apply() = new Nil
	def apply[T](x1: T): MyList[T] = new Cons(x1, new Nil)
	def apply[T](x1: T, x2: T): MyList[T] = new Cons(x1, new Cons(x2, new Nil))
}