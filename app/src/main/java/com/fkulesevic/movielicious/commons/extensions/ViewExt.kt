package com.fkulesevic.movielicious.commons.extensions

import android.view.View
import android.widget.EditText
import com.fkulesevic.movielicious.R
import com.fkulesevic.movielicious.ui.custom_helpers.SimpleTextWatcher
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.Marker

fun View.onClick(onClick: () -> Unit)
        = setOnClickListener { onClick() }

fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}

fun EditText.onTextChange(onTextChange: (String) -> Unit) = addTextChangedListener(SimpleTextWatcher { onTextChange(it) })
