package com.leeeyou.sampleofkotlin.basic.generic

fun main() {
    demoOut(object : Source<List<String>> {
        val listOf = listOf("i", "love", "china")

        override fun print() {
            println(listOf.toString())
        }

        override fun size(): Int {
            return listOf.size
        }

        override fun nextT(): List<String> {
            return listOf
        }
    })

    demoIn(object : MyComparable<Number> {
        override fun compareTo(other: Number): Int {
            return 100.minus(other.toInt())
        }
    })
}