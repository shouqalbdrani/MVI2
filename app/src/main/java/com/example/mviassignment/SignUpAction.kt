package com.example.mviassignment

sealed class SignUpAction {
    data class Loading(val isLoading: Boolean) : SignUpAction()
    data class Validation(
        val fullNameHasError: Boolean,
        val emailHasError: Boolean,
        val passwordHasError: Boolean,
        val conformPasswordHasError: Boolean,
    ) : SignUpAction()

    data class UpdateFields(
        val fullName: String = "",
        val email: String = "",
        val password: String = "",
        val conformPassword: String = "",
    ) : SignUpAction()

}
