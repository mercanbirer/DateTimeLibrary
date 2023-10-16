package com.example.date_time_library
import android.annotation.SuppressLint
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
