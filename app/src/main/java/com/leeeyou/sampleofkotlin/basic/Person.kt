package com.leeeyou.sampleofkotlin.basic

class Person {
    var name = "XunLei"
    var age = 15

    val nickname: String
        get() {
            return if (age > 15) "XunDaLei" else "XunXiaoLei"
        }
//        set(value) = "xiaolei"

    fun grow() {
        age += 1
    }

}