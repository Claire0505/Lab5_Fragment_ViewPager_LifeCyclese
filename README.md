# Lab5_Fragment_ViewPager_LifeCyclese

1. 在Kotlin 1.4.20-M2中，JetBrains廢棄了Kotlin Android Extensions編譯插件。
   取代findViewById 改成 View binding
   //https://proandroiddev.com/migrating-the-deprecated-kotlin-android-extensions-compiler-plugin-to-viewbinding-d234c691dec7
   //https://developer.android.com/topic/libraries/view-binding#kotlin
   
     1.0 在build.gradle加上
     
         buildFeatures {
        viewBinding true
       }
       
     1.1
        private lateinit var binding: ActivityMainBinding
        
     1.2 在 onCreate中加上
         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)
      
2. 建立FragmentPagerAdapter物件
   val adapter = ViewPagerAdapter(supportFragmentManager)
   連結 Adapter 讓畫面(Fragment)與 ViewPager 建立關連
   binding.viewPager.adapter = adapter
   
3.新增ViewPagerAdapter類別繼承 FragmentPagerAdapter，回傳對應位置的Fragment，決定頁面的呈現順序
4.增加LOG 觀查Activity與Fragment的生命週期
5.Kotlin 中沒有靜態的概念，甚至沒有 static 關鍵字
  Companion Object 伴生物件），基本上取代了 java class 對應的 static 區塊
  
    companion object {
        const val TAG = "MainActivity"
    }
