package com.example.date_time_library

import com.example.date_time_library.Utility.getFormatDate
import java.util.*

object TimeUtility {
    // "15:45:30"
    fun timeStandard(date: Date): String {
        return getFormatDate(date, Utility.TIME_STANDARD_PATTERN)
    }

    // "15:45"
    fun timeStandardWithoutSeconds(date: Date): String {
        return getFormatDate(date, Utility.TIME_STANDARD_WITHOUT_SECONDS)
    }

}