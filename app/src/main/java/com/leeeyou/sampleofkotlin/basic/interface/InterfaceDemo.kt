package com.leeeyou.sampleofkotlin.basic.`interface`

interface A {
    fun foo() {
        println("foo A")
    }

    fun bar()
}

interface B {
    fun foo() {
        println("foo B")
    }

    fun bar() {
        println("bar B")
    }
}

class C : A {
    override fun bar() {
        println("bar C")
    }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }

    fun setClickListener(listener: ClickListener?) {
        listener?.also { it.countClick() }
    }
}

fun main() {
    D().bar()
    D().foo()
    C().bar()

    D().setClickListener(object : ClickListener {
        override fun countClick() {
            println("点击回调")
        }
    })
}
