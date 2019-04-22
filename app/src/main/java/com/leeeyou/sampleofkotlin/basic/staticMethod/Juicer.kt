package com.leeeyou.sampleofkotlin.basic.staticMethod

fun makeAppleJuice() {
    println("做好了苹果汁")

    //这里没法引用到mCtx
}

class Juicer(val ctx: String) {

    var mCtx = ctx

    fun makeWatermelonJuice() {
        println("做好了西瓜汁")
    }

    companion object {
        //        @JvmStatic
        fun makeBananaJuice() {
            println("做好了香蕉汁")
        }
    }
}

fun main() {
    makeAppleJuice()
    Juicer.makeBananaJuice()
    Juicer("myContext").makeWatermelonJuice()
}