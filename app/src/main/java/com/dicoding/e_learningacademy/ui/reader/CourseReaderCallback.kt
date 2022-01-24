package com.dicoding.e_learningacademy.ui.reader

interface CourseReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}