package com.example.textviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.textviewkt.databinding.ActivityMainBinding

//기능에 해당되는 동적 기능을 담당
class MainActivity : AppCompatActivity() {

    //전역 변수로 바인딩 객체 선언
    private var mBinding: ActivityMainBinding? = null
    //매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) { //앱이 최초 실행됐을 때 수행
        super.onCreate(savedInstanceState)
    //        기존의 setContentView를 제거
    //        setContentView(R.layout.activity_main) // xml 화면 뷰를 연결

    // 자동 생성된 뷰 바인딩 클래스에서의 inflate라는 메서드를 활용해서
    // 액티비티에서 사용할 바인딩 클래스의 인스턴스 생성
    mBinding = ActivityMainBinding.inflate(layoutInflater)

    // getRoot 메소드로 레이아웃 내부의 최상위 위치 뷰의
    // 인스턴스를 활용하여 생성된 뷰를 액티비티에 표시

    setContentView(binding.root)

    // 이제부터 binding 바인딩 변수를 활용하여 마음 껏 xml 파일 내의 뷰 id 접근이 가능해진다.
    // 뷰 id도 파스칼 케이스 + 카멜 케이스 네이밍 규칙 적용으로 인해 tv_message -> tvMessage로 자동 변환
        binding.tvTitle.setText("Hello world") // 텍스트의 값을 변경한다.

    }
    // 액티비티 파괴시
    override fun onDestroy(){
        //onDestroy에서 binding class 인스턴스 참조를 정리해주어야 한다
        mBinding = null
        super.onDestroy()
    }
}