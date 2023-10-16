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
