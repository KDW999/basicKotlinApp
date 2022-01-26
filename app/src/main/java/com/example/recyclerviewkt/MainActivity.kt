package com.example.recyclerviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList  = arrayListOf( // ProfileAdapter에 보내주기 위해 만든 변수
            Profiles(R.drawable.man, "안드로이드", 22, "보안관"),
            Profiles(R.drawable.woman, "안드로삼드", 24, "작가"),
            Profiles(R.drawable.man, "안드로사드", 33, "화가"),
            Profiles(R.drawable.woman, "안드로오드", 25, "큐레이터"),
            Profiles(R.drawable.man, "안드로육드", 29, "감독"),
            Profiles(R.drawable.woman, "안드로칠드", 27, "개발자"),
            Profiles(R.drawable.man, "안드로팔드", 28, "매니저"),
            Profiles(R.drawable.woman, "안드로구드", 21, "아이돌"),
            Profiles(R.drawable.man, "안드로십드", 22, "배우"),
            Profiles(R.drawable.woman, "안드로십일드", 28, "소방관"),
        )

        rv_profile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_profile.setHasFixedSize(true)
        rv_profile.adapter = ProfileAdapter(profileList) // 만든 어댑터를 붙혀줌
    }
}