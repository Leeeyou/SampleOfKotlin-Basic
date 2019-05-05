package com.leeeyou.sampleofkotlin.basic.generic.kotlin

import com.google.gson.Gson
import com.leeeyou.sampleofkotlin.basic.generic.bean.Computer

//public <T> T fromJson(String json, Class<T> classOfT)throws JsonSyntaxException {
//...
//}

//对方法实施真泛型
inline fun <reified T> Gson.fromJson(json: String): T {
    return fromJson(json, T::class.java)
}

fun main() {
    val json = "{\"color\":\"black\",\"brand\":\"dell\",\"coreNum\":8}"
    val fromJson = Gson().fromJson<Computer>(json)
    println(fromJson.color)
    println(fromJson.brand)
    println(fromJson.coreNum)

    println("---")

    val b = MyView<Presenter>().presenter
    val a = MyView.Companion.invoke<Presenter>().presenter
    println(a)
    println(b)
}

//对类实施真泛型
class MyView<T>(private val clazz: Class<T>) {
    val presenter: T by lazy { clazz.newInstance() }

    companion object {
        //重载invoke调用操作符 MyView() -> MyView.invoke()
        //操作符重载 https://www.kotlincn.net/docs/reference/operator-overloading.html
        inline operator fun <reified T> invoke() = MyView(T::class.java)
    }
}

class Presenter {
    override fun toString(): String {
        return "presenter"
    }
}