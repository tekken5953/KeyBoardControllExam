package com.example.keyboardcontrollexam

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

/**
 * @author : Lee Jae Young
 * @since : 2023-05-11 오후 1:12
 **/
object KeyboardController {
    // 키보드 올리기
    fun upKeyboard(context: Context, et: EditText) {
        val inputMethodManager =
            context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        et.requestFocus()
        inputMethodManager.showSoftInput(et, InputMethodManager.SHOW_IMPLICIT)
    }

    // 키보드 내리기
    fun downKeyboard(context: Context, et: EditText) {
        val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        et.clearFocus()
        inputMethodManager.hideSoftInputFromWindow(et.windowToken, InputMethodManager.HIDE_IMPLICIT_ONLY)
    }
}