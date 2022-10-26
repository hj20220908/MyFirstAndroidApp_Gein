package com.example.myfirstandroidapp_gein

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        okBtn.setOnClickListener {

            // (입력한)변경할 닉네임을 변수에 저장
            val inputNewNickname = newNickNameEdit.text.toString()

            // 출발지로 돌아가면서(일반적인 화면 이동과 다름) inputNewNickname를 담아주기 위한 용도로만 사용하는 Intent
            val resultIntent = Intent()
            resultIntent.putExtra("nickname", inputNewNickname)
            setResult(RESULT_OK, resultIntent)

            finish()
        }

    }

}
