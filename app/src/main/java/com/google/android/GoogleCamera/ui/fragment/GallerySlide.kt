package com.google.android.GoogleCamera.ui.fragment

import androidx.recyclerview.widget.RecyclerView
import com.google.android.GoogleCamera.databinding.GallerySlideBinding

class GallerySlide(val binding: GallerySlideBinding) : RecyclerView.ViewHolder(binding.root) {
    @Volatile var currentPostion = 0
}
