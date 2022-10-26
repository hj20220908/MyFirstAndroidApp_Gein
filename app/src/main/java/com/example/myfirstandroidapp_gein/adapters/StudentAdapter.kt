package com.example.myfirstandroidapp_gein.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.myfirstandroidapp_gein.R
import com.example.myfirstandroidapp_gein.datas.Student

/**
 * 목록을 뿌려주는 담당인 Adaper 추가 작업
 * - ArrayAdapter를 상속받아서 기능 활용 예정
 */
class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {

    // xml을 가지고 객체로 변환해주는(화면에 뿌리도록 도와주는) 변수를 멤버변수로 생성
    val inf = LayoutInflater.from(mContext)

    // getView 함수를 오버라이딩, 기본 모양 X, 우리가 원하는 모양이 뿌려지게 하려고 오버라이딩
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        // convertView 변수를 var tempRow에 옮겨ㅏㅁ아서 null인 경우에는 새로 inflate해서 담는다.
        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null) // root : 부가정보
        }

        // 진짜 row를 만들어서 tempRow가 절대 null이 아니다 라고 하면서 대입.
        val row = tempRow!!

        // 최종적으로 리스트 뷰에 이 row를 뿌려달라고 리턴처리
        return row
    }


}