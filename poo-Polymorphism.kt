/*
 *	Polimorfismo
 */ 

fun main() {
	var miPerro: Perro = Perro()
	println("*** Instancia de la clase Perro: ")
	miPerro.comunicarse()
	miPerro.comer()
	imprimir(miPerro)

	println("*** Instancia de la clase Pajaro: ")
	var miPajaro: Pajaro = Pajaro()
	miPajaro.comunicarse()
	miPajaro.comer()
	imprimir(miPajaro)

	//Aplicación del polimorfismo
	//El animal se instancia como perro 
	//(no se puede instanciar como animal por que la clase es abstracta)
	println("*** Instancia de la clase Perro heredado de la clase Animal: ")
	var miAnimal:Animal = Perro()
	miAnimal.comunicarse()
	miAnimal.comer()
	imprimir(miAnimal)

	println("*** Instancia de la clase Pajaro heredado de la clase Animal: ")
	miAnimal= Pajaro()
	miAnimal.comunicarse()
	miAnimal.comer()

}

abstract class Animal () {

	abstract fun comunicarse()

	fun comer(){
		println("El animal está comiendo...")
	}
}

class Perro : Animal () {

	override fun comunicarse(){
		println("El perro está ladrando...")
	}
}

class Pajaro : Animal () {

	override fun comunicarse(){
		println("El pájaro está trinando...")
	}
}

//Por el polimorfismo, se le puede enviar un objeto de tipo clase padre
//en este caso Animal, y esta función aceptará como parámetro los tipos
//de clase que hereden de la clase padre Animal
fun imprimir(animal: Animal){
	println("Desde función global imprimir: + ${animal.comunicarse()}")
	println("Desde función global imprimir: + ${animal.comer()}")
}