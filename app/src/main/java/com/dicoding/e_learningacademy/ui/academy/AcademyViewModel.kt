package com.dicoding.e_learningacademy.ui.academy

import androidx.lifecycle.ViewModel
import com.dicoding.e_learningacademy.data.CourseEntity
import com.dicoding.e_learningacademy.utils.DataDummy

class AcademyViewModel : ViewModel() {

    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()
}