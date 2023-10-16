package com.example.date_time_library

import java.util.*

object DateTimeUtility {
    // "13 Ekim 2023 15:45:00"
    fun dateTimeStandard(date: Date): String {
        val pattern = "dd MMMM yyyy HH:mm:ss"

        return Utility.getFormatDate(date, pattern)
    }

    // "13 Ekim 2023 3:45:00 PM"
    fun dateTimeStandard12Hours(date: Date): String {
        val pattern = "dd MMMM yyyy h:mm:ss a"
        return Utility.getFormatDate(date, pattern)
    }

    // "13-10-2023 15:45:00"
    fun dateTimeStandardDigits(date: Date): String {
        val pattern = "dd-MM-yyyy HH:mm:ss"
        return Utility.getFormatDate(date, pattern)
    }

    // "13-10-2023 3:45:00 PM"
    fun dateTimeStandardDigitsAnd12Hours(date: Date): String {
        val pattern = "dd-MM-yyyy h:mm:ss a"
        return Utility.getFormatDate(date, pattern)
    }

    // "13 Ekim 2023 15:45:00")
    fun dateTimeStandardConcise(date: Date): String {
        val pattern = "dd MMM yyyy HH:mm:ss"
        return Utility.getFormatDate(date, pattern)
    }

    // "13 Ekim 2023 3:45:00 PM"
    fun dateTimeStandardConciseIn12Hours(date: Date): String {
        val pattern = "dd MMM yyyy h:mm:ss a"
        return Utility.getFormatDate(date, pattern)
    }

    // "13 Ekim 23 15:45:00"
    fun dateTimeLastTwoOfTheYear(date: Date): String {
        val pattern = "dd MMMM yy HH:mm:ss"
        return Utility.getFormatDate(date, pattern)
    }

    // "13-10-23 15:45:00"
    fun dateTimeLastTwoOfTheYearDigits(date: Date): String {
        val pattern = "dd-MM-yy HH:mm:ss"
        return Utility.getFormatDate(date, pattern)
    }

    // "13 Ekim 23 15:45:00
    fun dateTimeLastTwoOfTheYearConcise(date: Date): String {
        val pattern = "dd MMM yy HH:mm:ss"
        return Utility.getFormatDate(date, pattern)
    }
}