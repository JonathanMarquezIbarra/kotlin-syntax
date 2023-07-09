
fun main() {
    
    var miGuitarra : Guitarra = Guitarra("Café desierto")
    miGuitarra.tocar()
    miGuitarra.limpiar()
    miGuitarra.afinar()
}

//Con la palabra reservada open se indica que esta clase puede heredar a otra
open class InstrumentoMusical(){

	open fun tocar(){
		println("Está tocando el instrumento musical...")
	}

	fun limpiar (){
		println("Está limpiando el instrumento")
	}
}

//Para indicar de qué clase va a heredar, se usa 
//	: NombreDeLaClasePadre (parametrosClasePadre)
class Guitarra (color: String = "") : InstrumentoMusical () {
	var color: String = color
    
    //con Override se sobreescribe una función, en este caso tocar
    override fun tocar(){
        //con super se indica que acceda a la función del padre
        super.tocar()
        //y a continuación tiene su cuerpo propio sobreescribiendo
        //a la función original tocar
		println("Está tocando la guitarra")
	}
    
	fun afinar(){
		println("Se está afinando la guitarra de color $color")
	}
}