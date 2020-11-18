package com.example.lab5_fragment_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.lab5_fragment_viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //在Kotlin 1.4.20-M2中，JetBrains廢棄了Kotlin Android Extensions編譯插件。
    //findViewById 改成 binding
    //https://proandroiddev.com/migrating-the-deprecated-kotlin-android-extensions-compiler-plugin-to-viewbinding-d234c691dec7
    //https://developer.android.com/topic/libraries/view-binding#kotlin
    private lateinit var binding: ActivityMainBinding

    //Kotlin 中沒有靜態的概念，甚至沒有 static 關鍵字
    //Companion Object 伴生物件），基本上取代了 java class 對應的 static 區塊
    companion object {
        const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //初始化頁面
        //使用 Log追蹤MainActivity生命週期
        Log.e(TAG, "onCreate" )

        //建立FragmentPagerAdapter物件
        val adapter = ViewPagerAdapter(supportFragmentManager)
        //連結 Adapter 讓畫面(Fragment)與 ViewPager 建立關連
        binding.viewPager.adapter = adapter

    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart: " )
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume: " )
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause: " )
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop: " )
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart: " )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy: " )
    }
}

//繼承 FragmentPagerAdapter
class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm,
    FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    //回傳對應位置的Fragment，決定頁面的呈現順序
    override fun getItem(position: Int) = when(position){
        0 -> FirstFragment()    //第一頁要呈現的Fragment
        1 -> SecondFragment()   //第二頁要呈現的Fragment
        else -> ThirdFragment() //第三頁要呈現的Fragment
    }

    //回傳Fragment頁數
    override fun getCount() = 3
}