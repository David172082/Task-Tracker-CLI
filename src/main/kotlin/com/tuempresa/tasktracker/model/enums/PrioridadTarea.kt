package com.herreradavid.tasktracker.model.enums

enum class PrioridadTarea(
    val descripcion: String,
    val simbolo: String
) {
    BAJA("Baja", "🟢"),
    MEDIA("Media", "🟡"),
    ALTA("Alta", "🔴");

    fun mostrarPrioridad(): String {
        return "$simbolo $descripcion"
    }

    companion object {
        fun fromOrdinal(ordinal: Int): PrioridadTarea? {
            return values().getOrNull(ordinal)
        }
    }
}