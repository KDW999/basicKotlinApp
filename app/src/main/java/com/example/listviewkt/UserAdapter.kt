package com.example.listviewkt

import android.content.Context // 변수 타입을 Context로
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class UserAdapter (val context: Context, val UserList: ArrayList<User>) : BaseAdapter() // BaseAdapter는 안드로이드에서 기본으로 제공
//                                         UserList는 User 파일에 있는 클래스 객체를 사용
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item_user, null) // view를 붙히는 과정

        val profile = view.findViewById<ImageView>(R.id.iv_profile)
        val name = view.findViewById<TextView>(R.id.tv_name)
        val age = view.findViewById<TextView>(R.id.tv_age)
        val greet = view.findViewById<TextView>(R.id.tv_greet)

        val user = UserList[position]

        profile.setImageResource(user.profile)
        name.text = user.name
        age.text = user.age
        greet.text = user.greet

        return  view
    }

    override fun getItem(position: Int): Any {
        return UserList[position]

    }

    override fun getItemId(position: Int): Long {
        return 0

    }

    override fun getCount(): Int {
        return UserList.size

    }

}