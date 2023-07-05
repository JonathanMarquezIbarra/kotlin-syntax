/*
 * Data Class Syntax
 **/

data class Estudiante (var nombre: String, var apellido: String, var calificacion: Float){}

fun main() {
    val estudiante1: Estudiante = Estudiante("Pedro", "López", 7.8f)
    val estudiante2: Estudiante = Estudiante("Rosa", "Pérez", 8.3f)    
    val estudiante3: Estudiante = Estudiante("Jaime", "Rodríguez", 8.9f)
    
    imprimirEstudiante(estudiante1)
    imprimirEstudiante(estudiante2)
    imprimirEstudiante(estudiante3)
}

fun imprimirEstudiante(estudiante: Estudiante){
    println("Nombre: ${estudiante.nombre} \nApellido: ${estudiante.apellido} \nCalificación: ${estudiante.calificacion}")
    println("")
}