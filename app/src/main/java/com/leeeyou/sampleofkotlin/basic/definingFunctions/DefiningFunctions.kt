package com.leeeyou.sampleofkotlin.basic.definingFunctions

private fun double(x: Int = 100, y: Int = 200): Int {
    return (2 * x) + y
}

fun main() {
    println("返回值是：" + double().toString())
    println("返回值是：" + double(2).toString())
    println("返回值是：" + double(y = 10).toString())
    println("返回值是：" + double(y = 10, x = 2).toString())

//    println("返回值是：${double()}")
}