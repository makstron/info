package com.klim.utils

fun printLn(arr: Array<Int>) {
    for (i in 0 until arr.size) {
        print("${arr[i]} ")
    }
    println()
}

fun printLn(list: List<Int>) {
    for (element in list) {
        print("$element ")
    }
    println()
}
