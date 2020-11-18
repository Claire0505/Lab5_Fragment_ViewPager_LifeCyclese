package com.example.lab5_fragment_viewpager

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SecondFragment : Fragment() {
    companion object {
        const val TAG = "SecondFragment"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //初始化頁面
        Log.e(TAG, "onCreate: Fm2 初始化頁面" )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //連結畫面
        Log.e(TAG,"onCreateView: Fm2 連結畫面")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //連結Fragment與Activity
        Log.e(TAG, "onActivityCreated: Fm2 連結Fragment與Activity" )
    }

    override fun onStart() {
        super.onStart()
        //頁面可見
        Log.e(TAG, "onStart: Fm2 頁面可見")
    }

    override fun onResume() {
        super.onResume()
        //頁面與使用者開始互動
        Log.e(TAG, "onResume: Fm2 頁面與使用者開始互動")
    }

    override fun onPause() {
        super.onPause()
        //離開頁面
        Log.e(TAG, "onPause: Fm2 離開頁面" )
    }

    override fun onStop() {
        super.onStop()
        //頁面不可見
        Log.e(TAG, "onStop: Fm2 頁面不可見" )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        //移除畫面
        Log.e(TAG, "onDestroyView: Fm2 移除畫面" )
    }

    override fun onDestroy() {
        super.onDestroy()
        //回收頁面
        Log.e(TAG, "onDestroy: Fm2 回收頁面" )
    }

    override fun onDetach() {
        super.onDetach()
        //移除Fragment
        Log.e(TAG, "onDetach: Fm2 移除Fragment" )
    }

}