package com.example.datetimelibrary

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.date_time_library.DateUtility
import com.example.date_time_library.Utility
import com.example.date_time_library.Utility.parseDate

import com.example.datetimelibrary.ui.theme.DateTimeLibraryTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DateTimeLibraryTheme {
                val dateString = "2023 October 12"
                val date = parseDate(dateString, Utility.EXT_STANDARD_PATTERN)

                if (date != null) {
                    val deneme = DateUtility.dateStandard(date)
                    Log.e("deneme",deneme)
                }

            }

        }
    }
}
