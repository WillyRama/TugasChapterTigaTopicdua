package com.willyramad.tugaschaptertigatopicdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_serializable.*

class SerializableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serializable)
        ambilSerial()
    }
    fun ambilSerial(){
        val serialdata = intent.getSerializableExtra("HASIL") as DataSerial
        Serstatus.text = serialdata.hasil
    }
}