package com.herreradavid.tasktracker.utils

import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

object FechaHelper {
    const val FORMATO_FECHA = "dd/MM/yyyy"
    const val FORMATO_HORA = "HH:mm"

    fun obtenerFechaActual(): String {
        val fecha = LocalDate.now()
        val formato = DateTimeFormatter.ofPattern(FORMATO_FECHA)
        return fecha.format(formato)
    }

    fun obtenerHoraActual(): String {
        val hora = LocalTime.now()
        val formato = DateTimeFormatter.ofPattern(FORMATO_HORA)
        return hora.format(formato)
    }

    fun formatearFechaHora(): String {
        return "${obtenerFechaActual()} ${obtenerHoraActual()}"
    }
}