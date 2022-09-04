package com.willyramad.tugaschaptertigatopicdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bundle.*

class BundleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle)
        ambilBundle()
    }
    fun ambilBundle(){
        var bundledata = intent.extras
        Bunumur.setText(bundledata!!.getString("edUmur"))
        Buntinggi.setText(bundledata!!.getString("edTt"))
        Bunberat.setText(bundledata!!.getString("edTb"))
        Bunstatus.setText(bundledata!!.getString("Hasil"))
        Bunall.setText(bundledata!!.getString("Kategori"))

    }
}