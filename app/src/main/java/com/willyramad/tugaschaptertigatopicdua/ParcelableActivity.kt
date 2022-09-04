package com.willyramad.tugaschaptertigatopicdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_parcelable.*

class ParcelableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable)
        ambilparcel()
    }
    fun ambilparcel(){
        val Data = intent.getParcelableExtra("HASIL") as Dataparcel?
        Parstatus.text = Data?.hasil
    }
}