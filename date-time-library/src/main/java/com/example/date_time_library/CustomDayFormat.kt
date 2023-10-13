package com.example.date_time_library

import java.util.*

// "Perşembe"
fun Date?.day(): String {
    val pattern = "EEEE"
    return Utility.getFormatDate(this, pattern)
}
