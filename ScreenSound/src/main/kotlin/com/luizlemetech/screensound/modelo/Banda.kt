package com.luizlemetech.screensound.modelo

data class Banda(
    val nome: String = "Nome da badna",
    val descricao: String = "Descricao da Banda",
    val id: Int = 0
) {
    override fun toString(): String {
        return "$nome ($id)"
    }
}
