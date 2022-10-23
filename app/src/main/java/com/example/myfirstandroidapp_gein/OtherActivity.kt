package com.example.myfirstandroidapp_gein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {

    val REQUEST_FOR_NICKNAME = 1005

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        // 화면 접속 시 첨부된 데이터를 텍스트뷰에 반영
        val intentMessage = intent.getStringExtra("message")

        receivedMessageTxt.text = "${intentMessage}님 안녕하세요."

        // 닉네임 변경 버튼 클릭 시
        editNicknameBtn.setOnClickListener {

            val myIntent = Intent(this, EditNicknameActivity::class.java)

            // 데이터를 가지러 가는 이동일 경우 startActivityForResult를 사용함
            // requestCode는 가독성이 떨어짐 => 멤버 변수를 이용해서 어떤 요청인지 알아보기 쉽도록 변수에 담아서 활용함
//          Before :  startActivityForResult(myIntent, 1005)
            startActivityForResult(myIntent, REQUEST_FOR_NICKNAME)

        }

        // 로그아웃 버튼 클릭 시
        logoutBtn.setOnClickListener {

            Toast.makeText(this, "로그아웃 성공", Toast.LENGTH_SHORT).show()

            finish()

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // 돌아온 이유가 닉네임을 받으러 다녀온게 맞는지 확인
        if (requestCode == REQUEST_FOR_NICKNAME) {

            // 추가 질문 : 확인을 눌러서 돌아온게 맞는가?
            if (resultCode == RESULT_OK) {

                // 새 닉네임으로 반영
                val newNickname = data?.getStringExtra("nickname")
                nicknameTxt.text = newNickname

            }

        }

    }

}