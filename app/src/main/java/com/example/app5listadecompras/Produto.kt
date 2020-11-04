package com.example.app5listadecompras

import android.graphics.Bitmap

data class Produto(val nome: String, val quantidade: Int, val valor: Double, val foto: Bitmap? = null)