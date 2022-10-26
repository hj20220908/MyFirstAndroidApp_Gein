package com.example.myfirstandroidapp_gein

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstandroidapp_gein.adapters.StudentAdapter
import com.example.myfirstandroidapp_gein.datas.Student
import kotlinx.android.synthetic.main.activity_list_veiw.*

/**
 * 액티비티에서 실제 목록을 담아줄 ArrayList를 만들고, 그 안에 실제 데이터들을 담아준다.
 */
class ListVeiwActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_veiw)

        mStudentList.add(Student("코딩티처지니", 1988))
        mStudentList.add(Student("김민상", 1995))
        mStudentList.add(Student("조상민", 1975))
        mStudentList.add(Student("이영희", 1996))
        mStudentList.add(Student("박철수", 2000))
        mStudentList.add(Student("정민규", 1984))
        mStudentList.add(Student("장소영", 1962))

        // Adapter 클래스를 객체화
        mAdapter = StudentAdapter(this, R.layout.activity_list_veiw, mStudentList)

        studentListView.adapter = mAdapter

    }
}