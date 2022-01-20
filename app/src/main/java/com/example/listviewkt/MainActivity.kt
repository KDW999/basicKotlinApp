package com.example.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User(R.drawable.android, "김동우", "27", "안녕하신지요"), // User는 User 파일에 있는 User 클래스를 사용한 것
        User(R.drawable.android, "최웅", "29", "반갑습니다"),
        User(R.drawable.android, "국연수", "29", "안녕"),
        User(R.drawable.android, "김지웅", "29", "안녕하세요"),
        User(R.drawable.android, "엔제이", "21", "반가워요"),
        User(R.drawable.android, "정채란", "25", "도시락"),
        User(R.drawable.android, "지코바", "32", "맛있다")
    )
    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티의 실행 시작 지점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val item = arrayOf("사과", "배", "키위", "딸기", "김동우") // String 형태의 배열 생성
//        // context란 한 액티비티의 모든 정보를 담고있다.
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item) // listView는 adapter로 연결해줘야 사용 가능

        val Adapter = UserAdapter(this, UserList)
        listView.adapter = Adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User // parent -> 부모인 어댑터뷰, position은 해당 아이템의 위치, as User로 User 모델을 가져옴
            Toast.makeText(this, selectItem.greet, Toast.LENGTH_SHORT).show() // 토스트 메시지를 띄울건데 this로 현재 액티비티로 부터 띄울 거다
                                                                                    // 두번 째 인자는 클릭 시 나오는 메시지, selectItem.name은 User 파일에 있는 걸 사용

        }

    }
}