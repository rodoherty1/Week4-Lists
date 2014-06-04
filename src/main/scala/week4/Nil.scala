package week4

class Nil[T] extends List[T] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil head")
  def tail: Nothing = throw new NoSuchElementException("Nil tail")

}