package com.herreradavid.tasktracker.model

data class Categoria(
    val id: Int,
    var nombre: String,
    var descripcion: String
) {
    fun mostrarInfo(): String {
        return "[$id] $nombre - $descripcion"
    }
}