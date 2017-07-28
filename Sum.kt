/*
 * Your task is to implement the sum() function so that it computes the sum of
 * all elements in the given array a.
 * from: https://try.kotl.in/#/Examples/Problems/Sum/Sum.kt
 */
package sum

fun sum(a: IntArray): Int {
    // Write your solution here
    var suma = 0
	if (a.size > 0) {
        for(x in 0..a.size-1) {
            suma += a[x];
        }
        return suma
    }
    return 0
}


fun main(args: Array<String>) {
    if (args.size > 0) {
        
    } else {
        val x: IntArray = intArrayOf(1, 2, 3)
        println(sum(x))
    }
}
