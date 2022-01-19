package com.example.imageviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_toast.setOnClickListener { //버튼 클릭 시

            iv_profile.setImageResource(R.drawable.android_black) // 이미지 뷰에 새로운 이미지 등록
            Toast.makeText(this@MainActivity, "흑화", Toast.LENGTH_SHORT).show() // 토스트 메시지 출력

        }
    }
}