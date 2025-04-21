package com.example.mviassignment

sealed class SignUpIntent {

    data class UpdateField(
        val signUpFieldsType: SignUpFieldsType,
        val value: String
    ) : SignUpIntent()

    data object SignUpButtonClicked : SignUpIntent()
}


enum class SignUpFieldsType {
    FULL_NAME,
    EMAIL,
    PASSWORD,
    CONFORM_PASSWORD
}