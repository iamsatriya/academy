package com.example.academy.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.academy.R
import com.example.academy.databinding.ActivityDetailCourseBinding
import com.example.academy.databinding.ContentDetailCourseBinding

class DetailCourseActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_COURSE = "extra_course"
    }

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var detailContentBinding: ContentDetailCourseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDetailCourseBinding = ActivityDetailCourseBinding.inflate(layoutInflater)
        setContentView(activityDetailCourseBinding.root)
        setSupportActionBar(activityDetailCourseBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}