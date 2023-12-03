package com.klim.sort

import com.klim.utils.printLn

fun main() {
    val list = mutableListOf(3, 1, 4, 2)
    printLn(list)
    BubbleSort().run(list)
    printLn(list)
}

class BubbleSort {

    fun run(arr: MutableList<Int>) {
        val n = arr.size
        for (i in 0 until n) {
            for (j in 0 until  n - 1) {
                // Swap adjacent elements if they are in decreasing order
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1)
                }
            }
        }
    }

    private fun swap(array: MutableList<Int>, ind1: Int, ind2: Int) {
        val tmp = array[ind1]
        array[ind1] = array[ind2]
        array[ind2] = tmp
    }

}