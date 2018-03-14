package com.example.android.sampleconstraintlayou

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.view_sample_cell.view.*

/**
 * @author edm
 */
class SampleCell @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.view_sample_cell, this, true)
    }

    fun build(name: String, message: String, date: String) {
        nameLabel.text = name
        messageLabel.text = message
        dateLabel.text = date
    }
}
