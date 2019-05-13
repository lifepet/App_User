package com.example.app_user.ui.detail_adopt

import android.databinding.BindingAdapter
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@BindingAdapter("imageUrl","error")
    fun setImageUrl(view:ImageView,uri:String,error:Drawable){
    Glide.with(view.context).load(uri).apply(RequestOptions().override(150, 150)).into(view)
}