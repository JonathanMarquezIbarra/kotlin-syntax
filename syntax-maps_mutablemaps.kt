//Mapas y mapas muables

//Los mapas son colecciones de datos que funcionan mediante
//clave-valor ,cuyas claves son ùnicas, pero los valores si pueden repetirse.

//sintaxis bàsica:
//	mutableMapOf<tipo de la clave, tipo del valor>
//los mapas tambièn pueden deducir el tipo si se inicializan
//las variables usadas (inferencia de tipo); sintaxis:
//	val nombreDelMapa = mapOf(llave to valor, llave to valor, llave to valor)

fun main(){
	var partidosGanados = mutableMapOf<String, Int>("Chivas" to 3, "America" to 2, "Atlas" to 1, "Cruz azul" to 4)

	println(partidosGanados)
	//Los mapas tambièn pueden usar .size para conocer la cantidad de pares clave-valor
	println(partidosGanados.size)

	//Se pueden agregar registros indicando la llave nueva y el valor que contendrà
	partidosGanados["Pumas"] = 2
	println(partidosGanados.size)
	println(partidosGanados)

	//se puede usar la sintaxis de ìndice para obtener el valor de una llave
	println(partidosGanados["Atlas"])
	//o tambièn se puede utilizar get()
	println(partidosGanados.get("Cruz azul"))

	//se puede eliminar un par clave-valor mediante remove()
	partidosGanados.remove("America")
	println(partidosGanados)

	//para modificar el valor de una clave se puede usar put()
	partidosGanados.put("Chivas",4)
	//o tambien mediante la nootacion de ìndice
	partidosGanados["Atlas"] = 0
	println(partidosGanados)

}
