package com.fluex404

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    var number = 0
    fun addOne(){
        number++
    }
}