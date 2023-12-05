package com.klim.problems

import java.lang.Integer.max

/**
 * Знайти в лісту сабліст з максимальною сумою елементів
 */

fun main() {
    println(MaxSummSublist().run(listOf(1, 2, 3, 4), 2))
    println(MaxSummSublist().run(listOf(-1, -2, -3, -4), 2))
    println(MaxSummSublist().run(listOf(1, 2, 3, 4, 5, 6), 3))
    println(MaxSummSublist().run(listOf(1, 2, 3, 4, 5, 6), 1))
}

class MaxSummSublist {

    fun run(list: List<Int>, sublist: Int): Int {
        var max = Int.MIN_VALUE
        for (i in 0 ..  (list.size - sublist)) {
            var summ = 0
            for (j in 0 until  sublist) {
                summ += list.get(i + j)
            }
            max = max(max, summ)
        }
        return max
    }

}