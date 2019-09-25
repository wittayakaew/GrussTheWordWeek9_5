package com.example.android.guesstheword.screens.score

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ScoreViewMedelFactory (private val finalScore:Int):ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass:Class<T>):T{
        if (modelClass.isAssignableFrom(ScoreViewModel::class.java)) {
            return ScoreViewModel(finalScore) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}