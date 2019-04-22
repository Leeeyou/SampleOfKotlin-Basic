package com.leeeyou.sampleofkotlin.basic.lambda

//Ruby之父松本行弘在《代码的未来》一书中解释：闭包就是把函数以及变量包起来，使得变量的生存周期延长。

val echo = { name: String -> println(name) }

val lambdaA = { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int,
                i: Int, j: Int, k: Int, l: Int, m: Int, n: Int, o: Int, p: Int,
                q: Int, r: Int, s: Int, t: Int, u: Int, v: Int, w: Int ->
    println("23个入参的闭包")
}

fun main() {
    echo("iLoveChina")
    echo.invoke("iKnow")
    lambdaA(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
}