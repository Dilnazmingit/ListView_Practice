package com.example.practice_listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.practice_listview.databinding.ItemListBinding

class TeacherAdapter(
    private  val context: Context, private val teacherList: List<Teacher>
): BaseAdapter() {
    override fun getCount(): Int =teacherList.size
    override fun getItem(position: Int): Any?= teacherList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(
        position: Int, convertView: View?, parent: ViewGroup?
    ): View? {
        val binding: ItemListBinding
        val view: View

        if (convertView == null) {
            binding = ItemListBinding.inflate(LayoutInflater.from(context), parent, false)
            view = binding.root
            view.tag = binding   // ⭐ VERY IMPORTANT
        } else {
            view = convertView
            binding = view.tag as ItemListBinding
        }

        val teacher = teacherList[position]
        binding.nameTV.text = teacher.name
        binding.descriptionTV.text = teacher.description
        binding.profileCIV.setImageResource(teacher.imageRes)

        return binding.root
    }

}