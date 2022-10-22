package com.example.myfirstandroidapp_gein

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 버튼 클릭 이벤트
        okBtn.setOnClickListener {
            val inputContent = contentEdt.text.toString()
            resultTxt.text = inputContent
        }
    }

}