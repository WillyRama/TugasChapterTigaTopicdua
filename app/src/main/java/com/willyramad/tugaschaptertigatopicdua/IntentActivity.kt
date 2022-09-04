package com.willyramad.tugaschaptertigatopicdua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        ambilIntent()
    }
    fun ambilIntent(){
        var edumur = intent.getStringExtra("edUmur")
        var edtb = intent.getStringExtra("edTb")
        var edbb = intent.getStringExtra("edBb")
        var Hasil = intent.getStringExtra("Hasil")
        var all = intent.getStringExtra("Kategori")

        intentumur.text = edumur
        intentberat.text = edbb
        intenttinggi.text = edtb
        intentstatus.text = Hasil
        intentall.text = all

    }
}