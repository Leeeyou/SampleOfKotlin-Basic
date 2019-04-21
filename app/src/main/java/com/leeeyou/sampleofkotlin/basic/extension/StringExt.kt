package com.leeeyou.sampleofkotlin.basic.extension

import android.text.TextUtils

fun String.lastChar(): String? {
    if (TextUtils.isEmpty(this)) {
        return null
    }

    return this.substring(this.length - 1)
}