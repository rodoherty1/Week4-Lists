package week4

/*
 * My blind attempt at recoding MergeSort
 */
object MergeSort2 {

    def merge(left: List[Int], right: List[Int]): List[Int] = {
        (left, right) match {
            case (Nil, r) => r
            case (l, Nil) => l
            case (l, r) => if (l.head < r.head) l.head :: merge(l.tail, r) else r.head :: merge(l, r.tail)
        }
    }
    
    
    def apply(xs: List[Int]): List[Int] = {
        val mid = xs.length / 2
        if (mid == 0) xs
        else {
            val left = apply(xs take mid)
            val right = apply(xs drop mid)
            merge(apply(left), apply(right))
        }
    }
}