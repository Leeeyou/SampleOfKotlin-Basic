package com.leeeyou.sampleofkotlin.basic.`object`

import com.leeeyou.sampleofkotlin.basic.lambda.echo

object DataProviderManager {
    fun registerDataProvider(provider: String) {
        echo("$provider 注册成功")
    }
}

fun main() {
    DataProviderManager.registerDataProvider("1号数据源")

    val currentPoint = object {
        var x: Float = 90.1f
        var y: Float = 12.2f
    }

    TestObject.crateCity("深圳")
    TestObject.Companion.crateCity("北京")
}

class TestObject {
    companion object {
        fun crateCity(cityName: String) {
            echo("创建一座新的城市：$cityName")
        }
    }
}