package com.example.date_time_library

import java.util.*

// "13 Ekim 2023 15:45:00"
fun Date?.dateTimeStandard(): String {
    val pattern = "dd MMMM yyyy HH:mm:ss"

    return Utility.getFormatDate(this, pattern)
}

// "13 Ekim 2023 3:45:00 PM"
fun Date?.dateTimeStandard12Hours(): String {
    val pattern = "dd MMMM yyyy h:mm:ss a"
    return Utility.getFormatDate(this, pattern)
}

// "13-10-2023 15:45:00"
fun Date?.dateTimeStandardDigits(): String {
    val pattern = "dd-MM-yyyy HH:mm:ss"
    return Utility.getFormatDate(this, pattern)
}

// "13-10-2023 3:45:00 PM"
fun Date?.dateTimeStandardDigitsAnd12Hours(): String {
    val pattern = "dd-MM-yyyy h:mm:ss a"
    return Utility.getFormatDate(this, pattern)
}

// "13 Ekim 2023 15:45:00")
fun Date?.dateTimeStandardConcise(): String {
    val pattern = "dd MMM yyyy HH:mm:ss"
    return Utility.getFormatDate(this, pattern)
}

// "13 Ekim 2023 3:45:00 PM"
fun Date?.dateTimeStandardConciseIn12Hours(): String {
    val pattern = "dd MMM yyyy h:mm:ss a"
    return Utility.getFormatDate(this, pattern)
}

// "13 Ekim 23 15:45:00"
fun Date?.dateTimeLastTwoOfTheYear(): String {
    val pattern = "dd MMMM yy HH:mm:ss"
    return Utility.getFormatDate(this, pattern)
}

// "13 Ekim 23 3:45:00 PM"
fun Date?.dateTimeLastTwoOfTheYear12Hours(): String {
    val pattern = "dd MMMM yy h:mm:ss a"
    return Utility.getFormatDate(this, pattern)
}

// "13-10-23 15:45:00"
fun Date?.dateTimeLastTwoOfTheYearDigits(): String {
    val pattern = "dd-MM-yy HH:mm:ss"
    return Utility.getFormatDate(this, pattern)
}

// "13-10-23 3:45:00 PM"
fun Date?.dateTimeLastTwoOfTheYearDigitsAnd12Hours(): String {
    val pattern = "dd-MM-yy h:mm:ss a"
    return Utility.getFormatDate(this, pattern)
}

// "13 Ekim 23 15:45:00
fun Date?.dateTimeLastTwoOfTheYearConcise(): String {
    val pattern = "dd MMM yy HH:mm:ss"
    return Utility.getFormatDate(this, pattern)
}

// "13 Ekim 23 3:45:00 PM"
fun Date?.dateTimeLastTwoOfTheYearConcise12Hours(): String {
    val pattern = "dd MMM yy h:mm:ss a"
    return Utility.getFormatDate(this, pattern)
}

// "Z" represents Zulu time zone (UTC).
fun Date?.toZuluFormat(): String {
    val pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
    return Utility.getFormatDate(this, pattern)
}
