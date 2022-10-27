package com.example.myfirstandroidapp_gein

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        // 리스트뷰를 어뎁터에 연결
        studentListView.adapter = mAdapter

        // 목록 클릭 시 해당 row의 정보 표시 (짧게 누를 떄)
        studentListView.setOnItemClickListener { parent, view, position, id ->

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name}이 클릭 됨!", Toast.LENGTH_SHORT).show()

        }

        // 목록 클릭 시 해당 row의 정보 표시 (길게 누를 떄)
        studentListView.setOnItemLongClickListener { parent, view, position, id ->

//            val longClickedStudent = mStudentList[position]
//            Toast.makeText(this, "${longClickedStudent.name}이 길게 클릭 됨!", Toast.LENGTH_SHORT).show()
            
            mStudentList.removeAt(position) // 목록 제거

            mAdapter.notifyDataSetChanged()
            
            
            // true : long 클릭 전용
            // false : long 클릭 전용이 아님, long 클릭 이벤트와 짧게 누르는 이벤트도 실행됨
            return@setOnItemLongClickListener true

        }

    }
}