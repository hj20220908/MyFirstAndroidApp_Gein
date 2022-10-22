package com.example.myfirstandroidapp_gein

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 버튼 클릭 이벤트
        loginBtn.setOnClickListener {
            val inputId = idEdt.text.toString()
            val inputPw = passwordEdt.text.toString()

            // ID와 비밀번호가 일치하여야 관리자로 인증 됨
            if (inputId == "admin@test.com" && inputPw == "qwer") {

                Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()

                val myIntent = Intent(this, OtherActivity::class.java) // 객체화

                // 전달할 데이터 추가
                myIntent.putExtra("message", inputId)

                startActivity(myIntent)

            } else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }

        }
    }

}