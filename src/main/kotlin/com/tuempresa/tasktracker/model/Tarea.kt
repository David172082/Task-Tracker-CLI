package com.herreradavid.tasktracker.model

import com.herreradavid.tasktracker.model.enums.EstadoTarea
import com.herreradavid.tasktracker.model.enums.PrioridadTarea

data class Tarea(
    val id: Int,
    var titulo: String,
    var descripcion: String,
    var estado: EstadoTarea = EstadoTarea.PENDIENTE,
    val fechaCreacion: String,
    var prioridad: PrioridadTarea = PrioridadTarea.MEDIA,
    var categoria: Categoria? = null
) {

    fun cambiarEstado(nuevoEstado: EstadoTarea) {
        estado = nuevoEstado
    }

    fun mostrarInfo(): String {
        return """
            🆔 ID: $id
            📌 Título: $titulo
            📝 Descripción: $descripcion
            🔖 Estado: ${estado.mostrarEstado()}
            🎯 Prioridad: ${prioridad.mostrarPrioridad()}
            📂 Categoría: ${categoria?.mostrarInfo() ?: "Sin categoría"}
            📅 Fecha de creación: $fechaCreacion
        """.trimIndent()
    }

    fun mostrarResumen(): String {
        return "[$id] ${estado.simbolo} $titulo (${prioridad.simbolo}) [${categoria?.nombre ?: "Sin categoría"}]"
    }

    companion object {
        const val MAX_TITULO_LENGTH = 50

        fun validarTitulo(titulo: String): Boolean {
            return titulo.length <= MAX_TITULO_LENGTH
        }
    }
}