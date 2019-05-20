package com.example.app_user.ui.detailVolunteer

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import com.example.app_user.connecter.Connecter
import com.example.app_user.model.VolunteerModel
import com.example.app_user.util.getToken
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailVolunteerViewModel(val app: Application) : AndroidViewModel(app) {

    val volunteerModel = MutableLiveData<VolunteerModel>()
    val postId = MutableLiveData<String>()

    fun getVolunteerDetail() {
        Connecter.api.getVolunteerDetail(getToken(app.applicationContext), postId.value!!)
            .enqueue(object : Callback<VolunteerModel> {

                override fun onResponse(call: Call<VolunteerModel>, response: Response<VolunteerModel>) {
                    volunteerModel.value = response.body()
                }

                override fun onFailure(call: Call<VolunteerModel>, t: Throwable) {

                }

            })
    }
}