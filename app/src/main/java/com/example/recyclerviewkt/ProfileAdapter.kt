package com.example.recyclerviewkt

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter(val profileList: ArrayList<Profiles>) : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapter.CustomViewHolder {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false) // context는 해당 정보를 가져오는 것
         return CustomViewHolder(view).apply {  // CustomViewHolder에 view를 준다.
             itemView.setOnClickListener {
                 val curPos : Int = adapterPosition
                 val profile : Profiles = profileList.get(curPos)
                 Toast.makeText(parent.context, "이름 : ${profile.name}\n나이 : ${profile.age}\n직업 : ${profile.job}", Toast.LENGTH_SHORT).show()
             }
         }
    }

    override fun getItemCount(): Int {
         return profileList.size
    }

    override fun onBindViewHolder(holder: ProfileAdapter.CustomViewHolder, position: Int) {
         holder.gender.setImageResource(profileList.get(position).gender)
         holder.name.text = profileList.get(position).name
         holder.age.text = profileList.get(position).age.toString()
         holder.job.text = profileList.get(position).job
    }


    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gender = itemView.findViewById<ImageView>(R.id.iv_profile) // 성별
        val name = itemView.findViewById<TextView>(R.id.tv_name) // 이름
        val age = itemView.findViewById<TextView>(R.id.tv_age) // 나이
        val job = itemView.findViewById<TextView>(R.id.tv_job) // 직업

    }


}