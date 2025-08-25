package com.herreradavid.tasktracker.model.enums

enum class EstadoTarea(
    val descripcion: String,
    val simbolo: String
) {
    PENDIENTE("Por hacer", "⏳"),
    EN_PROGRESO("En progreso", "🔄"),
    COMPLETADA("Completada", "✅");

    fun mostrarEstado(): String {
        return "$simbolo $descripcion"
    }

    companion object {
        fun fromOrdinal(ordinal: Int): EstadoTarea? {
            return values().getOrNull(ordinal)
        }
    }
}