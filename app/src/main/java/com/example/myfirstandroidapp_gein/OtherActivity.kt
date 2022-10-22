package com.example.myfirstandroidapp_gein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        // 화면 접속 시 첨부된 데이터를 텍스트뷰에 반영
        val intentMessage = intent.getStringExtra("message")

        receivedMessageTxt.text = "${intentMessage}님 안녕하세요."

        logoutBtn.setOnClickListener {

            Toast.makeText(this, "로그아웃 성공", Toast.LENGTH_SHORT).show()

            finish()

        }

    }
}