package com.leeeyou.sampleofkotlin.basic

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*

const val TAG = "MainActivity"
//const val NUM: Int

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private var mGrammarList = mutableListOf<GrammarBean>()

    object TagListener {
        const val FirstPosition = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        initData()
        recyclerView.layoutManager = LinearLayoutManager(this)
        val grammarAdapter = GrammarAdapter(R.layout.item_grammar, mGrammarList)
        recyclerView.adapter = grammarAdapter
        grammarAdapter.setOnItemClickListener { adapter, _, position ->
            Toast.makeText(this@MainActivity, (adapter.getItem(position) as GrammarBean).name, Toast.LENGTH_SHORT)
                .show()

            when (position) {
                0 -> {
//                    Log.d(this@MainActivity.localClassName, "返回值是：" + double().toString())
//                    Log.d(this@MainActivity.localClassName, "返回值是：" + double(2).toString())
//                    Log.d(this@MainActivity.localClassName, "返回值是：" + double(y = 10).toString())
                    Log.d(this@MainActivity.localClassName, "返回值是：" + double(y = 10, x = 2).toString())
                }
                1 -> {
                    val name = "Rose"
                    var like = "Lang"
//                    name = "LiLy"
//                    like = "Reading"

//                    val person = Person()

//                    Log.d(this@MainActivity.localClassName, "名字是：" + person.name)
//                    person.name = "XunLeiLei"
//                    Log.d(this@MainActivity.localClassName, "名字是：" + person.name)

//                    Log.d(this@MainActivity.localClassName, "昵称是：" + person.nickname)
//                    person.nickname="XunMeiLei"
//                    person.grow()
//                    Log.d(this@MainActivity.localClassName, "昵称是：" + person.nickname)

//                    const val TAG = ""
                    Log.d(this@MainActivity.localClassName, "const val is ：" + TagListener.FirstPosition)

                }
                2 -> {
                    val price = """
                                ${'$'}9.99，


                                这里展示 / or // or \  or \\
                                """
                    Log.d(this@MainActivity.localClassName, "price is ：$price")
                }
                3 -> {
                    val num1 = 8
                    val num2 = 2

                    Log.d(this@MainActivity.localClassName, "$num1 左移 $num2 位后值为：" + (num1 shl num2))
                    Log.d(this@MainActivity.localClassName, "$num1 右移 $num2 位后值为：" + (num1 shr num2))
                    Log.d(this@MainActivity.localClassName, "-$num1 无符号右移 $num2 位后值为：" + (-num1 ushr num2))
                    Log.d(this@MainActivity.localClassName, "$num1 按位与 $num2 位后值为：" + (num1 and num2))
                    Log.d(this@MainActivity.localClassName, "$num1 按位或 $num2 位后值为：" + (num1 or num2))
                    Log.d(this@MainActivity.localClassName, "$num1 按位异或 $num2 位后值为：" + (num1 xor num2))
//                    Log.d(this@MainActivity.localClassName, "$num1 取反 后值为：" + inv(num1))
                }
            }
        }
    }

    private fun double(x: Int = 100, y: Int = 200): Int {
        return (2 * x) + y
    }

    private fun initData() {
        mGrammarList.add(GrammarBean("Defining functions", "Kotlin中方法可提供默认参数值。"))
        mGrammarList.add(GrammarBean("Defining variables", "Kotlin中用var表示变量，用val表示不可变的变量；Kotlin具有可推倒特性。"))
        mGrammarList.add(GrammarBean("Using string templates", "拼出丰富的字符串。"))
        mGrammarList.add(GrammarBean("Operations", "逻辑运算符与Java不同。"))
    }

    class GrammarAdapter(layoutRes: Int, grammarList: List<GrammarBean>) :
        BaseQuickAdapter<GrammarBean, BaseViewHolder>(layoutRes, grammarList) {
        override fun convert(helper: BaseViewHolder?, item: GrammarBean?) {
//            helper?.setText(R.id.tv_name, item?.name)?.setText(R.id.tv_desc, item?.desc)

            helper?.also { vh ->
                item?.also {
                    vh.setText(R.id.tv_name, it.name)
                        .setText(R.id.tv_desc, it.desc)
                }
            }
        }
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
