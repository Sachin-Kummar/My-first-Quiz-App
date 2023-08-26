package com.example.quiz

import android.os.Parcel
import android.os.Parcelable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class info: ViewModel(){
    val data = MutableLiveData<String>()
}
