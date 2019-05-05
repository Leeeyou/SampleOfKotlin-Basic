package com.leeeyou.sampleofkotlin.basic.generic.kotlin

//对于out泛型，我们能够将使用子类泛型的对象赋值给使用父类泛型的对象。（协变）
class Source<out T>(private val t: T) {
    fun nextT(): T {
        return t
    }

    //测试是否可作为入参类型
//    fun changeT(t: T) {
//        println("$t")
//    }

}
