package com.willyramad.tugaschaptertigatopicdua


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator_bmi.*

class CalculatorBmi : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_bmi)
        serial()
        bIntent()
        bbundle()
        parcel()

        btnhitung.setOnClickListener{
            var edumur = edumur.text.toString().toInt()
            var edtb = edTb.text.toString().toDouble()
            var edbb = edBb.text.toString().toDouble()
            var hasil = edbb/((edtb * edtb)/10000)

            if (hasil< 16.0){
                text.text =  "Umur Anda : $edumur tahun"+
                        "\nTinggi : ${edtb.toInt()} cm"+
                        "\nBerat Badan : ${edbb.toInt()} kg"+
                        "\nBMI Anda : $hasil"+
                        "\nKategori : Terlalu Kurus"
                } else if (hasil>=16 && hasil<17){
                text.text = "Umur Anda :$edumur tahun"+
                        "\nTinggi :${edtb.toInt()} cm"+
                        "\nBerat Badan :${edbb.toInt()} kg"+
                        "\nBMI Anda :$hasil"+
                        "\nKategori : Cukup Kurus"
                } else if (hasil>=17 && hasil<18.5){
                text.text = "Umur Anda : $edumur tahun"+
                        "\nTinggi : ${edtb.toInt()} cm"+
                        "\nBerat Badan : ${edbb.toInt()} kg"+
                        "\nBMI Anda : $hasil"+
                        "\nKategori : Sedikit Kurus"

                } else if (hasil>=18.5 && hasil<25){
                text.text = "Umur Anda : $edumur tahun"+
                        "\nTinggi : ${edtb.toInt()} cm"+
                        "\nBerat Badan : ${edbb.toInt()} kg"+
                        "\nBMI Anda : $hasil"+
                        "\nKategori : Normal"

                } else if (hasil>=25 && hasil<30){
                text.text = "Umur Anda : $edumur tahun"+
                        "\nTinggi : ${edtb.toInt()} cm"+
                        "\nBerat Badan : ${edbb.toInt()} kg"+
                        "\nBMI Anda : $hasil"+
                        "\nKategori : Gemuk"

                } else if (hasil>=30 && hasil<35){
                text.text = "Umur Anda : $edumur tahun"+
                        "\nTinggi : ${edtb.toInt()} cm"+
                        "\nBerat Badan : ${edbb.toInt()} kg"+
                        "\nBMI Anda : $hasil"+
                        "\nKategori : Obesitas Kelas I"

                } else if (hasil>=35 && hasil<40){
                text.text = "Umur Anda : $edumur tahun"+
                        "\nTinggi : ${edtb.toInt()} cm"+
                        "\nBerat Badan : ${edbb.toInt()} kg"+
                        "\nBMI Anda : $hasil"+
                        "\nKategori : Obesitas Kelas II"
                } else if (hasil>= 40.0){
                    text.text = "Umur Anda : $edumur tahun"+
                            "\nTinggi : ${edtb.toInt()} cm"+
                            "\nBerat Badan : ${edbb.toInt()} kg"+
                            "\nBMI Anda : $hasil"+
                            "\nKategori : Obesitas Kelas III"
                }
            }
            btnReset.setOnClickListener {
                reset()
        }
    }
    fun reset(){
        edumur.setText("")
        edTb.setText("")
        edBb.setText("")

    }
    fun bIntent(){
        btnIntent.setOnClickListener{
            var edumur = edumur.text.toString().toInt()
            var edtb = edTb.text.toString().toDouble()
            var edbb = edBb.text.toString().toDouble()
            var all = text.text.toString()
            var hasil = edbb/((edtb * edtb)/10000)
            var intent = Intent(this,IntentActivity::class.java)
            intent.putExtra("edUmur", edumur)
            intent.putExtra("edTb", edtb)
            intent.putExtra("edBb", edbb)
            intent.putExtra("Hasil", hasil)
            intent.putExtra("Kategori", all)
            startActivity(intent)
        }
    }
    fun bbundle(){
        BtnBundle.setOnClickListener{
            var edumur = edumur.text.toString().toInt()
            var edtb = edTb.text.toString().toDouble()
            var edbb = edBb.text.toString().toDouble()
            var all = text.text.toString()
            var hasil = edbb/((edtb * edtb)/10000)

            var bundle = Bundle()
            var intent = Intent (this, BundleActivity::class.java)
            intent.putExtra("edUmur", edumur)
            intent.putExtra("edTb", edtb)
            intent.putExtra("edBb", edbb)
            intent.putExtra("Hasil", hasil)
            intent.putExtra("Kategori", all)
            intent.putExtras(bundle)
            startActivity(intent)

        }
    }
    fun serial() {
        BtnSerial.setOnClickListener {
        var edumur = edumur.text.toString().toInt()
        var edtb = edTb.text.toString().toDouble()
        var edbb = edBb.text.toString().toDouble()
        var all = text.text.toString()
        var hasil = edbb / ((edtb * edtb) / 10000)

        val pindah = Intent(this,SerializableActivity::class.java)
        var ser = DataSerial(edumur.toString(),edbb.toString(),edtb.toString(),all,hasil.toString())
        pindah.putExtra("HASIL",ser)
        startActivity(pindah)
        }
    }
    fun parcel(){
        BtnParcelable.setOnClickListener {
            var edumur = edumur.text.toString().toInt()
            var edtb = edTb.text.toString().toDouble()
            var edbb = edBb.text.toString().toDouble()
            var all = text.text.toString()
            var hasil = edbb / ((edtb * edtb) / 10000)

            var pindah = Intent(this,ParcelableActivity::class.java)
            var par = Dataparcel(edbb.toString(), edtb.toString(), edumur.toString(),all, hasil.toString())
            pindah.putExtra("HASIL",par)
            startActivity(pindah)
        }
    }
}