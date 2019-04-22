package com.leeeyou.sampleofkotlin.basic.staticMethod

import android.content.Context
import android.util.Log

fun makeAppleJuice() {
    Log.d("Juicer", "做好了苹果汁")

    //这里没法引用到mCtx
}

class Juicer(val ctx: Context) {

    var mCtx = ctx

    fun makeWatermelonJuice() {
        Log.d("Juicer", "做好了西瓜汁")
    }

    companion object {
//        @JvmStatic
        fun makeBananaJuice() {
            Log.d("Juicer", "做好了香蕉汁")
        }
    }
}