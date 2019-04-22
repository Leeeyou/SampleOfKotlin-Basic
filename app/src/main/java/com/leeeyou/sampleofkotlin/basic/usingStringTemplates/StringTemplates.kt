package com.leeeyou.sampleofkotlin.basic.usingStringTemplates

fun main() {
    val price = """
                ${'$'}9.99，


                这里展示 / or // or \  or \\
                """
    println("price is ：$price")


    val i = 10
    println("i = $i") // prints "i = 10"

    val s = "abc"
    println("$s.length is ${s.length}") // prints "abc.length is 3"
}