package com.leeeyou.sampleofkotlin.basic.extension

val <T> List<T>.lastIndex: Int
    get() = size - 1

val <T> List<T>.centerIndex: Int
    get() = size / 2