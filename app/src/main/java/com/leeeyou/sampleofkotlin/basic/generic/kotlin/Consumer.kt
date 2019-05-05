package com.leeeyou.sampleofkotlin.basic.generic.kotlin

import com.leeeyou.sampleofkotlin.basic.generic.bean.Apple
import com.leeeyou.sampleofkotlin.basic.generic.bean.Fruit
import com.leeeyou.sampleofkotlin.basic.generic.bean.RedApple

//对于in泛型，我们可以将使用父类泛型的对象赋值给使用子类泛型的对象。（逆变）
interface Consumer<in E> {
    fun consume(item: E)

//    fun nextE():E
}

class Everybody : Consumer<Fruit> {
    override fun consume(item: Fruit) {
        println("Everybody Eat Fruit ${item.name}")
    }
}

class ModernPeople : Consumer<Apple> {
    override fun consume(item: Apple) {
        println("ModernPeople Eat Apple ${item.name}")
    }
}

class Chinese : Consumer<RedApple> {
    override fun consume(item: RedApple) {
        println("Chinese Eat RedApple ${item.name}")
    }
}