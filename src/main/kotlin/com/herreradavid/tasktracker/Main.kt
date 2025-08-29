package com.herreradavid.tasktracker

import com.herreradavid.tasktracker.model.Tarea
import com.herreradavid.tasktracker.model.Categoria
import com.herreradavid.tasktracker.model.enums.EstadoTarea
import com.herreradavid.tasktracker.model.enums.PrioridadTarea

fun main() {

    // Categorías
    val categoriaEstudio = Categoria(1, "Estudio", "Relacionado con aprendizaje y cursos")
    val categoriaTrabajo = Categoria(2, "Trabajo", "Tareas del ámbito laboral")
    val categoriaPersonal = Categoria(3, "Personal", "Cosas del día a día")

    // Crear tareas con distintas categorías y prioridades
    val tarea1 = Tarea(
        id = 1,
        titulo = "Aprender Kotlin",
        descripcion = "Repasar fundamentos y practicar ejercicios",
        estado = EstadoTarea.PENDIENTE,
        fechaCreacion = "19/08/2025",
        prioridad = PrioridadTarea.ALTA,
        categoria = categoriaEstudio
    )

    val tarea2 = Tarea(
        id = 2,
        titulo = "Preparar informe",
        descripcion = "Informe mensual para el equipo",
        estado = EstadoTarea.PENDIENTE,
        fechaCreacion = "19/08/2025",
        prioridad = PrioridadTarea.MEDIA,
        categoria = categoriaTrabajo
    )

    val tarea3 = Tarea(
        id = 3,
        titulo = "Ir al gimnasio",
        descripcion = "Rutina de 1 hora",
        estado = EstadoTarea.PENDIENTE,
        fechaCreacion = "19/08/2025",
        prioridad = PrioridadTarea.BAJA,
        categoria = categoriaPersonal
    )

    val tarea4 = Tarea(
        id = 4,
        titulo = "Proyecto de Kotlin",
        descripcion = "Avanzar en el proyecto integrador",
        estado = EstadoTarea.PENDIENTE,
        fechaCreacion = "19/08/2025",
        prioridad = PrioridadTarea.ALTA,
        categoria = categoriaEstudio
    )

// Guardar en una lista
    val tareas = listOf(tarea1, tarea2, tarea3)

    // Mostrar todas las tareas
    println("\nLista de tareas:\n")
    tareas.forEach {
        println(it.mostrarInfo())
        println("----------------------------------------------------")
    }
}