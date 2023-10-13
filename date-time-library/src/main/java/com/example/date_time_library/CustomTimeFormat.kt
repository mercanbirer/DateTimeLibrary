package com.example.date_time_library

import com.example.date_time_library.Utility.getFormatDate
import java.util.*

// "15:45:30"
fun Date?.timeStandard(): String {
    val pattern = "HH:mm:ss"
    return getFormatDate(this, pattern)
}

// "15:45"
fun Date?.timeStandardWithoutSeconds(): String {
    val pattern = "HH:mm"
    return getFormatDate(this, pattern)
}

// "3:45:30 PM"
fun Date?.timeStandard12Hours(): String {
    val pattern = "h:mm:ss a"
    return getFormatDate(this, pattern)
}

// "3:45 PM"
fun Date?.timeStandard12HoursWithoutSeconds(): String {
    val pattern = "h:mm a"
    return getFormatDate(this, pattern)
}
