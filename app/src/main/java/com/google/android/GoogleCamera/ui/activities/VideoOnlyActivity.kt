package com.google.android.GoogleCamera.ui.activities

import android.os.Bundle
import com.google.android.GoogleCamera.R

class VideoOnlyActivity : MainActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        captureButton.setImageResource(R.drawable.recording)

        tabLayout.alpha = 0f
        tabLayout.isClickable = false
        tabLayout.isEnabled = false
//        (tabLayout.layoutParams as ViewGroup.MarginLayoutParams).let {
//            it.setMargins(it.leftMargin, it.height, it.rightMargin, it.bottomMargin)
//            it.height = 0
//        }
//
//        (previewView.layoutParams as ViewGroup.MarginLayoutParams).let {
//            it.setMargins(it.leftMargin, it.topMargin, it.rightMargin, 0)
//        }
    }

}