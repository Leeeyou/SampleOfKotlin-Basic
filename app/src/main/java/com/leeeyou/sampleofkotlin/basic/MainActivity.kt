package com.leeeyou.sampleofkotlin.basic

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.text.TextUtils
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.leeeyou.sampleofkotlin.basic.extension.centerIndex
import com.leeeyou.sampleofkotlin.basic.extension.hideKeyboard
import com.leeeyou.sampleofkotlin.basic.extension.lastChar
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
                    //kotlin中没有?:这样的三目表达式
                    Log.d(
                        this@MainActivity.localClassName,
                        if (TextUtils.isEmpty("".lastChar())) "空串" else "".lastChar()
                    )
                    Log.d(this@MainActivity.localClassName, "iLoveChina".lastChar())

                    hideKeyboard()

                    Log.d(this@MainActivity.localClassName, "最后一位的坐标：" + (listOf(1, 2, 3, 4, 5).lastIndex).toString())
                    Log.d(this@MainActivity.localClassName, "中位的坐标：" + (listOf(1, 2, 3, 4, 5).centerIndex).toString())
                }
            }
        }
    }


    private fun initData() {
        mGrammarList.add(GrammarBean("Extensions", "扩展函数和扩展属性是Kotlin中重要的特性。"))
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
