package com.example.app_user.ui.detailProtect

import android.arch.lifecycle.LiveData
import android.databinding.BindingAdapter
import android.graphics.drawable.Drawable
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.app_user.adapter.LostCommentAdapter
import com.example.app_user.adapter.ProtectCommentAdapter
import com.example.app_user.model.LostCommentModel
import com.example.app_user.model.ProtectCommentModel

@BindingAdapter("image","errorImage")
fun setImageUrl(view: ImageView, uri:String?, error: Drawable){
    Glide.with(view.context).load(uri).apply(RequestOptions().override(150, 150)).into(view)
}

@BindingAdapter("protectData")
fun RecyclerView.setProtectComment(data: LiveData<ArrayList<ProtectCommentModel>>) {
    val protectCommentAdapter: ProtectCommentAdapter = adapter as ProtectCommentAdapter
    data.value?.let { protectCommentAdapter.item = it }
}