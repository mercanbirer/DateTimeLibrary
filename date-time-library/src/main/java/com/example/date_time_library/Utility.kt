package com.example.date_time_library
import java.text.SimpleDateFormat
import java.util.*

object Utility {
    private lateinit var simpleDateFormat: SimpleDateFormat

    fun getFormatDate(date: Date?, pattern: String): String {
        simpleDateFormat = SimpleDateFormat(pattern, Locale.getDefault())
        return if (date != null)
            simpleDateFormat.format(date)
        else
            return "Date is mandatory"
    }

}
