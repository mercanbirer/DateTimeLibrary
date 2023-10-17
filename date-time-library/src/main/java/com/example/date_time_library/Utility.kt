package com.example.date_time_library

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

object Utility {

    const val STANDARD_PATTERN = "dd MMMM yyyy"
    const val EXT_STANDARD_PATTERN = "yyyy MMMM dd"

    const val STANDARD_CONCISE_PATTERN = "dd MMM yyyy"
    const val EXT_STANDARD_CONCISE_PATTERN = "yyyy MMM dd"

    const val STANDARD_DIGITS_PATTERN = "dd-MM-yyyy"
    const val EXT_STANDARD_DIGITS_PATTERN = "yyyy-MM-dd"

    const val LAST_TWO_OF_THE_YEAR_PATTERN = "dd MMMM yy"
    const val EXT_LAST_TWO_OF_THE_YEAR_PATTERN = "yy MMMM dd"

    const val LAST_TWO_OF_THE_YEAR_DIGITS_PATTERN = "dd-MM-yy"
    const val EXT_LAST_TWO_OF_THE_YEAR_DIGITS_PATTERN = "yy-MM-dd"

    const val YEAR_MONTH_DAY_PATTERN = "yyyy MMMM dd"
    const val EXT_YEAR_MONTH_DAY_PATTERN = "dd MMMM yyyy"

    const val YMD_CONCISE_PATTERN = "yyyy MMM dd"
    const val EXT_YMD_CONCISE_PATTERN = "dd MMM yyyy"

    const val YEAR_MONTH_DAY_DIGITS_PATTERN = "yyyy-MM-dd"
    const val EXT_YEAR_MONTH_DAY_DIGITS_PATTERN = "dd-MM-yyyy"


    //   ---------TİME---------
    const val TIME_STANDARD_PATTERN = "HH:mm:ss"
    const val EXT_TIME_STANDARD_PATTERN = "HH:mm:ss"

    const val TIME_STANDARD_WITHOUT_SECONDS = "HH:mm:ss"
    const val EXT_TIME_STANDARD_WITHOUT_SECONDS = "ss:mm:HH"


    //     -------DATETİME-------
    const val DATETIME_STANDARD = "dd MMMM yyyy HH:mm:ss"

    const val DATETIME_STANDARD_12_HOURS = "dd MMMM yyyy h:mm:ss a"

    const val DATETIME_STANDARD_DIGITS = "dd-MM-yyyy HH:mm:ss"

    const val DATETIME_STANDARD_12_HOURS_DIGITS = "dd-MM-yyyy h:mm:ss a"

    const val DATETIME_STANDARD_CONCISE = "dd MMM yyyy HH:mm:ss"

    const val DATETIME_STANDARD_CONCISE_IN_12_HOURS = "dd MMM yyyy h:mm:ss a"

    const val DATETIME_LAST_TWO_OF_THE_YEAR = "dd MMMM yy HH:mm:ss"

    const val DATETIME_LAST_TWO_OF_THE_YEAR_DIGITS = "dd-MM-yy HH:mm:ss"

    const val DATETIME_LAST_TWO_OF_THE_YEAR_CONCISE = "dd MMM yy HH:mm:ss"


    fun getFormatDate(date: Date?, pattern: String): String {
        val simpleDateFormat = SimpleDateFormat(pattern, Locale.getDefault())
        return if (date != null)
            simpleDateFormat.format(date)
        else
            return "Date is mandatory"
    }

    fun parseDate(dateString: String, pattern: String): Date? {
        val sdf = SimpleDateFormat(pattern, Locale.getDefault())
        return try {
            sdf.parse(dateString)
        } catch (e: ParseException) {
            null
        }
    }
}
