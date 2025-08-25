package com.herreradavid.tasktracker.utils

object FechaHelper {
    const val FORMATO_FECHA = "dd/MM/yyyy"

    fun obtenerFechaActual(): String {
        // Por ahora hardcodeado, luego se puede usar LocalDate.now()
        return "20/08/2025"
    }

    fun obtenerHoraActual(): String {
        // Por ahora hardcodeado, luego se puede usar LocalTime.now()
        return "14:30"
    }

    fun formatearFechaHora(): String {
        // Combina fecha y hora
        return "${obtenerFechaActual()} ${obtenerHoraActual()}"
    }
}