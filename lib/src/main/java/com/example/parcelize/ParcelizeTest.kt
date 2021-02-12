package com.example.parcelize

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class ParcelizeTest<out T : CharSequence> : Parcelable