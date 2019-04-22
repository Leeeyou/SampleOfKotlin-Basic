package com.leeeyou.sampleofkotlin.basic.generic

import android.util.Log

//Source的元素是协变的，可以将T作为返回值类型
interface Source<out T> {
    fun nextT(): T

    //    fun changeT(t: T) //测试是否可作为入参类型

    fun size(): Int

    fun print()
}

fun demoOut(strs: Source<List<String>>) {
    val objects: Source<Any> = strs // This is OK, since T is an out-parameter
    Log.d("Generics", objects.size().toString())
    objects.print()
}


interface MyComparable<in T> {
    operator fun compareTo(other: T): Int
//    fun get():T
}

fun demoIn(x: MyComparable<Int>) {
    Log.d("Generics", x.compareTo(20).toString())
}