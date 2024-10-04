package com.example.muliar_lab_32

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var dateTextView: TextView
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    private var currentDate: Calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dateTextView = findViewById(R.id.dateTextView)
        updateDate()
    }

    private fun updateDate() {
        val formattedDate = dateFormat.format(currentDate.time)
        dateTextView.text = formattedDate
    }

    fun addOneDay(view: View) {
        currentDate.add(Calendar.DAY_OF_MONTH, 1)
        updateDate()
    }
}
