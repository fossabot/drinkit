package com.drinkit.common

import java.time.LocalDate

object Constants {

    val ID_REGEX = Regex("[\\da-fA-F]{24}")
    val INVISIBLE_CHARS_REGEX = Regex("[\\u0000-\\u001f]")
    val SPECIAL_CHAR_REGEX = Regex("[!@#\$%&*()_+=|<>?{}\\\\[\\\\]~-]")

    const val MIN_FIRSTNAME_LENGTH = 2
    const val MAX_FIRSTNAME_LENGTH = 100
    const val MIN_LASTNAME_LENGTH = 2
    const val MAX_LASTNAME_LENGTH = 100

    // OWASP Email Regex: https://owasp.org/www-community/OWASP_Validation_Regex_Repository
    val VALID_EMAIL_REGEX = Regex("[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}")
    const val MAX_EMAIL_LENGTH = 100

    const val MIN_PASSWORD_LENGTH = 10

    val MIN_BIRTH_DATE: LocalDate = LocalDate.parse("1900-01-01")

    const val MIN_LATITUDE = -90.0
    const val MAX_LATITUDE = 90.0
    const val MIN_LONGITUDE = -180.0
    const val MAX_LONGITUDE = 180.0

    const val COUNTRY_CODE_LENGTH = 2

    const val MAX_CELLAR_NAME_LENGTH = 100
}