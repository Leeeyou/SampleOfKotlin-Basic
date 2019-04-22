package com.leeeyou.sampleofkotlin.basic.generic

//Source的元素是协变的，可以将T作为返回值类型
interface Source<out T> {
    fun nextT(): T

    //    fun changeT(t: T) //测试是否可作为入参类型

    fun size(): Int

    fun print()
}

fun demoOut(strs: Source<List<String>>) {
    val objects: Source<Any> = strs // This is OK, since T is an out-parameter
    println(objects.size().toString())
    objects.print()
}

//MyComparable的元素是逆变的，可以将T作为入参
interface MyComparable<in T> {
    operator fun compareTo(other: T): Int
//    fun get():T
}

fun demoIn(x: MyComparable<Number>) {
    println(x.compareTo(20).toString())
    val y: MyComparable<Double> = x // OK!
    println(y.compareTo(20.0).toString())
}