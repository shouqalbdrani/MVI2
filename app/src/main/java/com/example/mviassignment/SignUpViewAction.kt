package com.example.mviassignment

sealed class SignUpViewAction {
    data class ShowToast(val message: String) : SignUpViewAction()
    object ShowErrorDialog : SignUpViewAction()
}