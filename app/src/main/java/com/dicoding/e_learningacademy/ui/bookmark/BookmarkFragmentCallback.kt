package com.dicoding.e_learningacademy.ui.bookmark

import com.dicoding.e_learningacademy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
