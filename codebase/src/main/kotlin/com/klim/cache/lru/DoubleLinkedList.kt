package com.klim.cache.lru

class DoubleLinkedList<D> {

    class Data<D>(
        var value: D,
    ) {
        var previous: Data<D>? = null
        var next: Data<D>? = null
    }

    var first: Data<D>? = null
    var last: Data<D>? = null

    var size: Int = 0
        private set

    fun add(value: D): Data<D> {
        val d = Data(value)
        if (first == null) {
            first = d
            last = d
        } else {
            last!!.next = d
            d.previous = last
            last = d
        }
        size++
        return d
    }

    fun removeFirst() {
        if (first != null) {
            first?.next?.previous = null
            first = first?.next
        }
        size--
    }

    fun removeItem(d: Data<D>) {
        d.previous?.next = d.next
        d.next?.previous = d.previous

        if (d.previous == null) {
            first = d.next
        }
        if (d.next == null) {
            last = d.previous
        }

        d.previous = null
        d.next = null
    }

    fun print() {
        var next = first
        while(next != null) {
            print("[${next.value}], ")
            next = next.next
        }
        println()
    }

}