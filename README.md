# 📝 TaskTracker

TaskTracker es una aplicación de consola escrita en **Kotlin** para la gestión de tareas.  
Permite crear, listar, actualizar estados, y organizar las tareas por **prioridad** y **categoría**.  

---

## 📂 Estructura del Proyecto

```
TaskTracker/
├── src/main/kotlin/com/tuempresa/tasktracker/
│   ├── Main.kt
│   ├── model/
│   │   ├── Tarea.kt
│   │   ├── Categoria.kt
│   │   └── enums/
│   │       ├── EstadoTarea.kt
│   │       └── Prioridad.kt
│   ├── service/
│   │   └── GestorTareas.kt
│   ├── ui/
│   │   └── Menu.kt
│   └── utils/
│       └── FechaHelper.kt
```

---

## 📌 Funcionalidades

✅ Crear una tarea con:  
- **Título**  
- **Descripción**  
- **Estado inicial** (Pendiente, En Progreso, Completada)  
- **Prioridad** (Baja, Media, Alta)  
- **Categoría** (ej. "Estudios", "Trabajo")  
- **Fecha de creación automática**  

✅ Listar todas las tareas en consola.   
✅ Validación de títulos con longitud máxima (`MAX_TITULO_LENGTH`).  

---

## 🛠️ Uso del programa

### Ejecución

1. Compilar el proyecto en IntelliJ o con Gradle/Maven.
2. Ejecutar el archivo `Main.kt`.


---

## 📸 Ejemplo de salida

```
Lista de tareas:

    ID: 1
    Título: Aprender Kotlin
    Descripción: Practicar fundamentos de Kotlin
    Estado: ⏳ Por hacer
    Prioridad: 🔴 Alta
    Categoría: Programación
    Fecha de creación: 20/08/2025
----------------------------------------------------
    ID: 2
    Título: Leer un libro
    Descripción: Terminar novela pendiente
    Estado: ✅ Completada
    Prioridad: 🟡 Media
    Categoría: Ocio
    Fecha de creación: 20/08/2025
----------------------------------------------------
```

---

## 🚀 Tecnologías utilizadas
- [Kotlin](https://kotlinlang.org/)  
- Programación orientada a objetos  
- Enums, data classes, companion objects y objetos singleton  

---

## 👨‍💻 Autor
**David Herrera**