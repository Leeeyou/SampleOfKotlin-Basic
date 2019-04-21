package com.leeeyou.sampleofkotlin.basic.extension

import android.app.Activity
import android.util.Log

fun Activity.hideKeyboard() {
    Log.d(this@hideKeyboard.localClassName, "准备隐藏软键盘了")
}