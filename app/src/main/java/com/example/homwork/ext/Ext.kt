package com.example.homwork.ext

import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment


fun ImageView.loadImage(uri: String?) {
    Glide.with(this).load(uri).into(this)
}

fun Fragment.showToast(msg: String) {
    Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()

}
