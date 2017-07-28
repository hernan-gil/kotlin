/*
 * Your task is to implement the indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
 */
package maxindex

fun indexOfMax(a: IntArray): Int? {
    if(a.size != 0) {
            var maxTemp : Int = 0
        for (x in 0..a.size - 1) {
            if(a[x] >= maxTemp) {
                maxTemp = x
            }
        }
        return maxTemp;
    }
    return null
}

fun main(args: Array<String>) {
    if (args.size > 0) {
        
    } else {
        val x: IntArray = intArrayOf(1, 2, 3)
        println(indexOfMax(x))
    }
}
