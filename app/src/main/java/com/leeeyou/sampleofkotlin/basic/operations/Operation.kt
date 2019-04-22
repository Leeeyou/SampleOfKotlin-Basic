package com.leeeyou.sampleofkotlin.basic.operations

fun main() {
    val num1 = 8
    val num2 = 2

    println("$num1 左移 $num2 位后值为：" + (num1 shl num2))
    println(
        " $num1 带符号右移 $num2 位后值为："
                + (num1 shr num2)
                + " :: " + Integer.toBinaryString(num1)
                + " -> " + Integer.toBinaryString(num1 shr num2)
    )
    println(
        "-$num1 带符号右移 $num2 位后值为："
                + (-num1 shr num2) + " :: "
                + Integer.toBinaryString(-num1) + " -> "
                + Integer.toBinaryString(-num1 shr num2)
    )
    println(
        " $num1 无符号右移 $num2 位后值为："
                + (num1 ushr num2)
                + " :: " + Integer.toBinaryString(num1)
                + " -> " + Integer.toBinaryString(num1 ushr num2)
    )
    println(
        "-$num1 无符号右移 $num2 位后值为："
                + (-num1 ushr num2) + " :: "
                + Integer.toBinaryString(-num1) + " -> "
                + Integer.toBinaryString(-num1 ushr num2)
    )
    println("$num1 按位与 $num2 位后值为：" + (num1 and num2))
    println("$num1 按位或 $num2 位后值为：" + (num1 or num2))
    println("$num1 按位异或 $num2 位后值为：" + (num1 xor num2))
    println(
        "$num1 取反后值为："
                + num1.inv() + " :: "
                + Integer.toBinaryString(num1.inv())
    )
}