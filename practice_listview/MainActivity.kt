package com.example.practice_listview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practice_listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var teacherList: ArrayList<Teacher>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        loadData()
        val adapter= TeacherAdapter(this, teacherList)
        binding.listview.adapter =adapter

    }

    private fun loadData() {

        teacherList = arrayListOf(
            Teacher("AminulIslam Munna","he is a very good boy", Age =85,imageRes= R.drawable.flower),
            Teacher("AminulIslam Munna","he is a very good boy", Age =85,imageRes= R.drawable.flower),
            Teacher("AminulIslam Munna","he is a very good boy", Age =85,imageRes= R.drawable.flower),
            Teacher("AminulIslam Munna","he is a very good boy", Age =85,imageRes= R.drawable.flower),
            Teacher("AminulIslam Munna","he is a very good boy", Age =85,imageRes= R.drawable.flower),
            Teacher("AminulIslam Munna","he is a very good boy", Age =85,imageRes= R.drawable.flower),
            Teacher("AminulIslam Munna","he is a very good boy", Age =85,imageRes= R.drawable.flower),
            Teacher("AminulIslam Munna","he is a very good boy", Age =85,imageRes= R.drawable.flower),
            Teacher("AminulIslam Munna","he is a very good boy", Age =85,imageRes= R.drawable.flower),




            )
    }



}