package com.willyramad.tugaschaptertigatopicdua

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

data class Dataparcel(var edumur : String, var edtb: String, var edbb: String, var hasil : String, var all: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(edumur)
        parcel.writeString(edtb)
        parcel.writeString(edbb)
        parcel.writeString(hasil)
        parcel.writeString(all)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Dataparcel> {
        override fun createFromParcel(parcel: Parcel): Dataparcel {
            return Dataparcel(parcel)
        }

        override fun newArray(size: Int): Array<Dataparcel?> {
            return arrayOfNulls(size)
        }
    }
}

