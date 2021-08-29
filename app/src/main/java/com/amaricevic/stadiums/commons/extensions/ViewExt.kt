package com.amaricevic.stadiums.commons.extensions

import android.view.View
import android.widget.EditText
import com.amaricevic.stadiums.ui.custom_helpers.SimpleTextWatcher

fun View.onClick(onClick: () -> Unit)
        = setOnClickListener { onClick() }

fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}

fun EditText.onTextChange(onTextChange: (String) -> Unit) = addTextChangedListener(SimpleTextWatcher { onTextChange(it) })
