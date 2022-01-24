package com.dicoding.e_learningacademy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.dicoding.e_learningacademy.data.CourseEntity
import com.dicoding.e_learningacademy.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}