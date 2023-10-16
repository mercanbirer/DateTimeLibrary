package com.example.date_time_library

import com.example.date_time_library.Utility.getFormatDate
import java.util.*

object DateUtility {
    // "13 Ekim 2023"
    fun dateStandard(date: Date): String {
        return getFormatDate(date, Utility.STANDARD_PATTERN)
    }

    // "13 Ekim 2023"
    fun dateStandardConcise(date: Date): String {
        return getFormatDate(date, Utility.STANDARD_CONCISE_PATTERN)
    }

    // "13-10-2023"
    fun dateStandardDigits(date: Date): String {
        return getFormatDate(date, Utility.STANDARD_DIGITS_PATTERN)
    }

    // "13 Ekim 23"
    fun dateLastTwoOfTheYear(date: Date): String {
        return getFormatDate(date, Utility.LAST_TWO_OF_THE_YEAR_PATTERN)
    }

    // "13-10-23"
    fun dateLastTwoOfTheYearDigits(date: Date): String {
        return getFormatDate(date, Utility.LAST_TWO_OF_THE_YEAR_DIGITS_PATTERN)
    }

    // , "2023 Ekim 13"
    fun dateYearMonthDay(date: Date): String {
        return getFormatDate(date, Utility.YEAR_MONTH_DAY_PATTERN)
    }

    // "2023 Ekim 13"
    fun dateYMDConcise(date: Date): String {
        return getFormatDate(date, Utility.YMD_CONCISE_PATTERN)
    }

    // "2023-10-13"
    fun dateYearMonthDayDigits(date: Date): String {
        return getFormatDate(date, Utility.YEAR_MONTH_DAY_DIGITS_PATTERN)
    }
}