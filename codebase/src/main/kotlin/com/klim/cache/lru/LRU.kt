package com.klim.cache.lru

import java.util.*

fun main() {
    val cache = LRU<Int, Int>(3)
    cache.print()

    (1..10).forEach {
        cache.add(LRU.Chunk(it, Random().nextInt(10)))
        cache.print()
    }

    println()

    cache.add(LRU.Chunk(8, Random().nextInt(10)))
    cache.print()

    cache.get(9)
    cache.print()

    cache.get(8)
    cache.print()

    println()
    println()


    cache.get(8)
    cache.print()

}

class LRU<K, T>(var sizeLimit: Int) {

    data class Chunk<K, T>(val key: K, val data: T)

    private val list = DoubleLinkedList<Chunk<K, T>>() //old (last) -> not so old -> new (first)
    private val map = mutableMapOf<K, DoubleLinkedList.Data<Chunk<K, T>>>()

    fun add(data: Chunk<K, T>) {
        if (list.size >= sizeLimit) {
            map.remove(list.first?.value?.key)
            list.removeFirst()
        }
        map[data.key] = list.add(data)
    }

    fun get(key: K): Chunk<K, T>? {
        val data = map[key]

        data?.also {
            list.removeItem(it)
            map[key] = list.add(it.value)
        }
            return data?.value
    }

    fun print() {
        list.print()
    }

}