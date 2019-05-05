package com.leeeyou.sampleofkotlin.basic.generic.kotlin

import com.leeeyou.sampleofkotlin.basic.generic.bean.Apple
import com.leeeyou.sampleofkotlin.basic.generic.bean.GreenApple
import com.leeeyou.sampleofkotlin.basic.generic.bean.RedApple
import java.util.*

fun main() {
//    testOut()
//    testIn()

    testArrayCopy()
}

fun testArrayCopy() {
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any = Array<Any>(3) { "" }
    copy(ints, any)
}

fun testIn() {
    val consumer1: Consumer<RedApple> = Everybody()
    val consumer2: Consumer<RedApple> = ModernPeople()
    val consumer3: Consumer<RedApple> = Chinese()

    consumer1.consume(RedApple("大大的红苹果1"))
    consumer2.consume(RedApple("大大的红苹果2"))
    consumer3.consume(RedApple("大大的红苹果3"))
}

fun testOut() {
    val redApple: Source<RedApple> = Source(RedApple("山东红苹果"))
    println(redApple.nextT().name)
//    redApple.changeT(RedApple("花牛苹果"))
    val apple: Source<Apple> = redApple //error
    println()

    val redAppleList: List<RedApple> = arrayListOf(RedApple("红苹果1"), RedApple("红苹果2"), RedApple("红苹果3"))
    redAppleList.forEach { println(it.name) }
    println()

    var appleList: List<Apple> = redAppleList
    appleList.forEach { println(it.name) }
    println()

    val greenAppleList: List<GreenApple> = arrayListOf(GreenApple("绿苹果1"), GreenApple("绿苹果2"), GreenApple("绿苹果3"))
    appleList = greenAppleList
    appleList.forEach { println(it.name) }
    println()
}


/**
 * 这里发生的事情称为类型投影：from不仅仅是一个数组，而是一个受限制的数组：我们只可以调用返回类型为类型参数 T 的方法，这个案例中我们只能调用 get()。
 * 这就是我们的使用处型变的用法，并且是对应于 Java 的 Array<? extends Object>、 但使用更简单些的方式。
 */
fun copy(from: Array<out Any>, to: Array<Any>) {
    for (i in from.indices)
        to[i] = from[i]
}