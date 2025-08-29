package com.herreradavid.tasktracker.ui

import com.herreradavid.tasktracker.model.Tarea
import com.herreradavid.tasktracker.model.Categoria
import com.herreradavid.tasktracker.model.enums.EstadoTarea
import com.herreradavid.tasktracker.model.enums.PrioridadTarea
import com.herreradavid.tasktracker.service.GestorTareas
import com.herreradavid.tasktracker.utils.FechaHelper

import java.util.Scanner

class Menu(private val gestor: GestorTareas) {

    private val scanner = Scanner(System.`in`)

    fun iniciar() {
        var opcion: Int
        do {
            mostrarOpciones()
            print("Seleccione una opción: ")
            opcion = scanner.nextInt()
            scanner.nextLine() // limpiar buffer

            when (opcion) {
                1 -> crearTarea()
                2 -> listarTareas()
                3 -> cambiarEstado()
                4 -> listarPorEstado()
                5 -> println("Saliendo del programa...")
                else -> println("Opción no válida.")
            }
        } while (opcion != 5)
    }

    private fun mostrarOpciones() {
        println("\n===== MENU DE TAREAS =====")
        println("1. Crear tarea")
        println("2. Listar todas las tareas")
        println("3. Cambiar estado de tarea")
        println("4. Listar tareas por estado")
        println("5. Salir")
    }

    private fun crearTarea() {
        println("\n--- Crear nueva tarea ---")
        print("ID: ")
        val id = scanner.nextInt()
        scanner.nextLine()

        print("Título: ")
        val titulo = scanner.nextLine()

        print("Descripción: ")
        val descripcion = scanner.nextLine()

        println("Seleccione prioridad: 1=BAJA, 2=MEDIA, 3=ALTA")
        val prioridadInput = scanner.nextInt()
        scanner.nextLine()
        val prioridad = when (prioridadInput) {
            1 -> PrioridadTarea.BAJA
            2 -> PrioridadTarea.MEDIA
            3 -> PrioridadTarea.ALTA
            else -> PrioridadTarea.MEDIA
        }

        println("Ingrese categoría:")
        print("ID categoría: ")
        val idCat = scanner.nextInt()
        scanner.nextLine()
        print("Nombre categoría: ")
        val nombreCat = scanner.nextLine()
        print("Descripción categoría: ")
        val descCat = scanner.nextLine()
        val categoria = Categoria(idCat, nombreCat, descCat)

        val tarea = Tarea(
            id,
            titulo,
            descripcion,
            EstadoTarea.PENDIENTE,
            FechaHelper.obtenerFechaActual(),
            prioridad,
            categoria
        )

        gestor.agregarTarea(tarea)
        println("✅ Tarea creada con éxito")
    }

    private fun listarTareas() {
        println("\n--- Lista de tareas ---")
        val tareas = gestor.listarTareas()
        if (tareas.isEmpty()) {
            println("No hay tareas registradas.")
        } else {
            tareas.forEach {
                println(it.mostrarInfo())
                println("----------------------------------------------------")
            }
        }
    }

    private fun cambiarEstado() {
        println("\n--- Cambiar estado de tarea ---")
        print("Ingrese ID de la tarea: ")
        val id = scanner.nextInt()
        scanner.nextLine()

        println("Seleccione nuevo estado: 1=PENDIENTE, 2=EN_PROGRESO, 3=COMPLETADA")
        val estadoInput = scanner.nextInt()
        scanner.nextLine()
        val nuevoEstado = when (estadoInput) {
            1 -> EstadoTarea.PENDIENTE
            2 -> EstadoTarea.EN_PROGRESO
            3 -> EstadoTarea.COMPLETADA
            else -> EstadoTarea.PENDIENTE
        }

        gestor.cambiarEstadoTarea(id, nuevoEstado)
        println("✅ Estado actualizado")
    }

    private fun listarPorEstado() {
        println("\n--- Listar tareas por estado ---")
        println("Seleccione estado: 1=PENDIENTE, 2=EN_PROGRESO, 3=COMPLETADA")
        val estadoInput = scanner.nextInt()
        scanner.nextLine()
        val estado = when (estadoInput) {
            1 -> EstadoTarea.PENDIENTE
            2 -> EstadoTarea.EN_PROGRESO
            3 -> EstadoTarea.COMPLETADA
            else -> EstadoTarea.PENDIENTE
        }

        val tareas = gestor.listarTareas().filter { it.estado == estado }

        if (tareas.isEmpty()) {
            println("No hay tareas con estado ${estado.mostrarEstado()}")
        } else {
            println("Tareas en estado ${estado.mostrarEstado()}:")
            tareas.forEach {
                println(it.mostrarResumen())
            }
        }
    }
}