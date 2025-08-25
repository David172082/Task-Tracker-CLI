package com.herreradavid.tasktracker.service

import com.herreradavid.tasktracker.model.Tarea

class GestorTareas {

    private val tareas = mutableListOf<Tarea>()

    // Agregar una tarea
    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
    }

    // Listar todas las tareas
    fun listarTareas(): List<Tarea> {
        return tareas
    }

    // Buscar tarea por ID
    fun buscarPorId(id: Int): Tarea? {
        return tareas.find { it.id == id }
    }

    // Eliminar tarea por ID
    fun eliminarTarea(id: Int): Boolean {
        return tareas.removeIf { it.id == id }
    }

    // Cambiar estado de una tarea existente
    fun cambiarEstadoTarea(id: Int, nuevoEstado: com.herreradavid.tasktracker.model.enums.EstadoTarea): Boolean {
        val tarea = buscarPorId(id)
        return if (tarea != null) {
            tarea.cambiarEstado(nuevoEstado)
            true
        } else {
            false
        }
    }

    // Mostrar tareas formateadas
    fun mostrarTareas() {
        if (tareas.isEmpty()) {
            println("⚠️ No hay tareas registradas.")
        } else {
            println("📋 Lista de tareas:\n")
            tareas.forEach { tarea ->
                println(tarea.mostrarInfo())
                println("----------------------------------------------------")
            }
        }
    }
}