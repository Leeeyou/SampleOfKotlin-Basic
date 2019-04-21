package com.leeeyou.sampleofkotlin.basic.`interface`

import android.util.Log

interface A {
    fun foo() {
        Log.d("InterfaceDemo", "foo A")
    }

    fun bar()
}

interface B {
    fun foo() {
        Log.d("InterfaceDemo", "foo B")
    }

    fun bar() {
        Log.d("InterfaceDemo", "bar B")
    }
}

class C : A {
    override fun bar() {
        Log.d("InterfaceDemo", "bar C")
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
