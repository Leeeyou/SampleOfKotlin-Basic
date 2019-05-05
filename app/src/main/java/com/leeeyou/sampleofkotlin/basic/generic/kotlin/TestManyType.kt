package com.leeeyou.sampleofkotlin.basic.generic.kotlin

import android.view.*
import android.view.accessibility.AccessibilityEvent

//Kotlin的泛型可以同时限定多个类型
class TestManyType<T> where T : Window.Callback, T : Runnable {
    fun add(t: T) {
        t.run()
        t.onContentChanged()
    }
}

fun main() {
    val testManyType = TestManyType<A>()
    testManyType.add(A())
}

class A : Window.Callback, Runnable {
    override fun onActionModeFinished(p0: ActionMode?) {
        println("-")
    }

    override fun onCreatePanelView(p0: Int): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dispatchTouchEvent(p0: MotionEvent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreatePanelMenu(p0: Int, p1: Menu?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onWindowStartingActionMode(p0: ActionMode.Callback?): ActionMode {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onWindowStartingActionMode(p0: ActionMode.Callback?, p1: Int): ActionMode {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAttachedToWindow() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dispatchGenericMotionEvent(p0: MotionEvent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dispatchPopulateAccessibilityEvent(p0: AccessibilityEvent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dispatchTrackballEvent(p0: MotionEvent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dispatchKeyShortcutEvent(p0: KeyEvent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dispatchKeyEvent(p0: KeyEvent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onMenuOpened(p0: Int, p1: Menu?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onPanelClosed(p0: Int, p1: Menu?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onMenuItemSelected(p0: Int, p1: MenuItem?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDetachedFromWindow() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onPreparePanel(p0: Int, p1: View?, p2: Menu?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onWindowAttributesChanged(p0: WindowManager.LayoutParams?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onWindowFocusChanged(p0: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onContentChanged() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSearchRequested(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSearchRequested(p0: SearchEvent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onActionModeStarted(p0: ActionMode?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun run() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}