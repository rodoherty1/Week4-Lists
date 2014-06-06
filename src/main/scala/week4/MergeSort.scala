package week4

object MergeSort {

    def apply(xs: List[Int]): List[Int] = {
        val n = xs.length / 2
        if (n == 0) xs
        else {
	        def merge(xs: List[Int], ys: List[Int]): List[Int] = {
	            (xs, ys) match {
	                case (Nil, ys) => ys
	                case (xs, Nil) => xs
	                case (x :: xs1, y :: ys1) =>
	                    if (x < y) x :: merge(xs, ys1)
	                    else y :: merge(xs, ys1)
	            }
	        }
	
	        val (fst, snd) = xs splitAt n
	        merge(apply(fst), apply(snd))
        }
    }
}