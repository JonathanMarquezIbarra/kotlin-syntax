//CONJUNTOS

//Un conjunto es una colecciòn de datos cuyos elementos no se repiten
//y no tienen con un orden especìfico, se identifican mediante un hash
//un hash es un Int que es generado por el mètodo hashcode()

fun main(){
	val conjunto = mutableSetOf<Int>(4,5,6,7,8,9)

	//se conoce el tamaño de un conjunto mediante .size
	println(conjunto.size)

	//se usa add() para agregar un elemento, como no hay un orden
	//especìfico, no se usan ìndices
	conjunto.add(10)

	println(conjunto)

	//para comprobar si existe un valor en el conjunto se usa contains()
	//si existe devolverà un true
	if (/*conjunto.contains(2)*/2 in conjunto){
		println(conjunto)
	} else {
		println("El conjunto no contiene el elemento requerido.")
	}	//NOTA: conjunto.contains(valor) = valor in conjunto

	//para eliminar un elemento se usa remove()
	conjunto.remove(5)

	println(conjunto)
}