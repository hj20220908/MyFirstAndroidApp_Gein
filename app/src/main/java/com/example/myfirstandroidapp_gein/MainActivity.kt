package com.example.myfirstandroidapp_gein

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 문법 연습
        val myName : String // 상수
        var myAge : Int // 변수
        var myName2 = "코딩티처 지니"
        val num1 = 10

        clickBtn.setOnClickListener {
            // 확인 클릭 시 이벤트 처리
            Log.d("메인화면", "클릭용 버튼 눌림")
            Log.e("메인화면로그", "에러 관련 로그")
        }

        smallBtn.setOnClickListener {
            // 취소 버튼 클릭 시
            Toast.makeText(this, "취소 버튼 눌림", Toast.LENGTH_SHORT).show()
        }
    }

}