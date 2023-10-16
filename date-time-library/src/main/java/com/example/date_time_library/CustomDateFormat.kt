package com.example.date_time_library

import com.example.date_time_library.Utility.getFormatDate
import java.util.*

// "13 Ekim 2023"
fun Date?.dateStandard(): String {
    val pattern = "dd MMMM YYYY"
    return getFormatDate(this, pattern)
}

// "13 Ekim 2023"
fun Date?.dateStandardConcise(): String {
    val pattern = "dd MMM yyyy"
    return getFormatDate(this, pattern)
}

// "13-10-2023"
fun Date?.dateStandardDigits(): String {
    val pattern = "dd-MM-yyyy"
    return getFormatDate(this, pattern)
}

// "13 Ekim 23"
fun Date?.dateLastTwoOfTheYear(): String {
    val pattern = "dd MMMM yy"
    return getFormatDate(this, pattern)
}

// "13-10-23"   LastTwoOfTheYear
fun Date?.dateLastTwoOfTheYearDigits(): String {
    val pattern = "dd-MM-yy"
    return getFormatDate(this, pattern)
}

// , "2023 Ekim 13"
fun Date?.dateYearMonthDay(): String {
    val pattern = "yyyy MMMM dd"
    return getFormatDate(this, pattern)
}

// "2023 Ekim 13"
fun Date?.dateYMDConcise(): String {
    val pattern = "yyyy MMM dd"
    return getFormatDate(this, pattern)
}

// "2023-10-13"
fun Date?.dateYearMonthDayDigits(): String {
    val pattern = "yyyy-MM-dd"
    return getFormatDate(this, pattern)
}