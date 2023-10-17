package com.example.date_time_library

import java.util.*

object DateTimeUtility {
    // "13 Ekim 2023 15:45:00"
    fun dateTimeStandard(date: Date): String {
        return Utility.getFormatDate(date, Utility.DATETIME_STANDARD)
    }

    // "13 Ekim 2023 3:45:00 PM"
    fun dateTimeStandard12Hours(date: Date): String {
        return Utility.getFormatDate(date, Utility.DATETIME_STANDARD_12_HOURS)
    }

    // "13-10-2023 15:45:00"
    fun dateTimeStandardDigits(date: Date): String {
        return Utility.getFormatDate(date, Utility.DATETIME_STANDARD_DIGITS)
    }

    // "13-10-2023 3:45:00 PM"
    fun dateTimeStandardDigitsAnd12Hours(date: Date): String {
        return Utility.getFormatDate(date, Utility.DATETIME_STANDARD_12_HOURS_DIGITS)
    }

    // "13 Ekim 2023 15:45:00")
    fun dateTimeStandardConcise(date: Date): String {
        return Utility.getFormatDate(date, Utility.DATETIME_STANDARD_CONCISE)
    }

    // "13 Ekim 2023 3:45:00 PM"
    fun dateTimeStandardConciseIn12Hours(date: Date): String {
        return Utility.getFormatDate(date, Utility.DATETIME_STANDARD_CONCISE_IN_12_HOURS)
    }

    // "13 Ekim 23 15:45:00"
    fun dateTimeLastTwoOfTheYear(date: Date): String {
        return Utility.getFormatDate(date, Utility.DATETIME_LAST_TWO_OF_THE_YEAR)
    }

    // "13-10-23 15:45:00"
    fun dateTimeLastTwoOfTheYearDigits(date: Date): String {
        return Utility.getFormatDate(date, Utility.DATETIME_LAST_TWO_OF_THE_YEAR_DIGITS)
    }

    // "13 Ekim 23 15:45:00
    fun dateTimeLastTwoOfTheYearConcise(date: Date): String {
        return Utility.getFormatDate(date, Utility.DATETIME_LAST_TWO_OF_THE_YEAR_CONCISE)
    }
}