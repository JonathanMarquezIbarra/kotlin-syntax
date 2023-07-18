/***
 * Interfaces
 */

//Las interfaces son contratos que deben cumplirse, similares a
//una clase abstracta.
//pueden tener clases abstractas (no es necesario indicarlo explicitamente)
//pueden tener clases finales dentro sin que sean abstractas
//permite realizar un comportamiento similar a lo que serìa
//la herencia mùltiple (kotlin no cuenta con ella)


fun main(){
	
	println("iniciar")

	var miClaseC: ClaseC = ClaseC()
	miClaseC.documento = 123
	miClaseC.nombre = "David Pèrez"
	miClaseC.imprimirDatos()

	miClaseC.funcionSinParametrosSinRetorno()
	miClaseC.funcionConParametrosSinRetorno(miClaseC.documento)

	var msj = miClaseC.funcionConParametrosConRetorno(miClaseC.nombre)
	println(msj)

	miClaseC.imprimir("El mensaje desde el Main...")	
}

interface InterfaceA {
	fun funcionSinParametrosSinRetorno()
	fun funcionConParametrosSinRetorno(id: Int)
	fun funcionConParametrosConRetorno(nombre: String): String

	fun imprimir (mensaje: String){
		println("Ingresa a la funciòn imprimir " + "desde la Interface A...")
		println("mensaje")
	}
}

class ClaseC : InterfaceA{
	var documento: Int = 0
	var nombre: String = ""

	fun imprimirDatos(){
		println("Documento: $documento, Nombre: $nombre")
	}

	override fun funcionSinParametrosSinRetorno(){
		println("Desde la funciòn 1")
	}

	override fun funcionConParametrosSinRetorno(id: Int){
		println("Desde la funciòn 2, id= $id")
	}


	override fun funcionConParametrosConRetorno(nombre: String): String {
		var mensaje = "Desde la funciòn 3, nombre = $nombre"
		return mensaje
	}
}