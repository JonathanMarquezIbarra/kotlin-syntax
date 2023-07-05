/**
 * Object Syntax
 **/ 

fun main() {
    Robot.nombre = "Terminator"
    Robot.iniciar()
}

object Robot{
    var nombre: String = ""

    fun iniciar(){
        println("El robot $nombre ha comenzado a funcionar....")
    }
}