package com.example.listacurso

import androidx.annotation.DrawableRes

class Linguagens (
    val titulo: String,
    val subTitulo: String,
    @DrawableRes
    val logo: Int
        )

fun listaLinguagem() : List<Linguagens> {
    return arrayListOf(
    Linguagens("Kotlin", "Orientação a Objetos, Funcional", R.drawable.ic_logo_kotlin),
    Linguagens("Java", "Orientação a Objetos", R.drawable.ic_logo_java),
    Linguagens("JavaScript", "Orientação a Objetos", R.drawable.ic_logo_javascript),
    Linguagens("Swift", "Orientação a Objetos, Funcional", R.drawable.ic_logo_swift),
    Linguagens("PHP", "Orientação a Objetos", R.drawable.ic_logo_php),
    Linguagens("Python", "Orientação a Objetos", R.drawable.ic_logo_python),
    Linguagens("C#", "Orientação a Objetos", R.drawable.ic_c_sharp)
    )
}


