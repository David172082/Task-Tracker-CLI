package com.herreradavid.tasktracker

import com.herreradavid.tasktracker.model.Tarea
import com.herreradavid.tasktracker.model.Categoria
import com.herreradavid.tasktracker.model.enums.EstadoTarea
import com.herreradavid.tasktracker.model.enums.PrioridadTarea
import com.herreradavid.tasktracker.service.GestorTareas
import com.herreradavid.tasktracker.ui.Menu

fun main() {
    val gestor = GestorTareas()

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

    // Agregar al gestor
    gestor.agregarTarea(tarea1)
    gestor.agregarTarea(tarea2)
    gestor.agregarTarea(tarea3)
    gestor.agregarTarea(tarea4)

    // Cambiar estados de las tareas 2, 3 y 4
    gestor.cambiarEstadoTarea(2, EstadoTarea.EN_PROGRESO)
    gestor.cambiarEstadoTarea(3, EstadoTarea.COMPLETADA)
    gestor.cambiarEstadoTarea(4, EstadoTarea.EN_PROGRESO)

    // Mostrar tareas
    gestor.mostrarTareas()

    // CLI Interactivo
    // Menu(gestor).iniciar()
}