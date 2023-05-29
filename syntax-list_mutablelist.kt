// LISTAS

//Son colecciones redimensinables, funcionan como un array fijo que cuando
//alcanza su capacidad màxima, se copia automàticamente en un nuevo array màs grande.
//array original:
//	|1|2|3|4|5|
//se le quiere insertar un nùmero entre el 2 y el 3, se cambia todo el arreglo a uno nuevo
//con mayor tamaño y es creado automàticamente.
//	|1|2| 9 |3|4|5|vacìo|vacìo|vacìo|
//todos los elementos que ya estaban despuès del ìndice en el cual se agregò el nuevo nùmero
//se recorren hacia la derecha en el nuevo arreglo.

//Diferencia entre list y mutablelist
//list: los elementos solo pueden leerse
//mutablelist: permite agregar o quitar elementos de una lista

fun main(){
	//sintaxis bàsica de una lista
	val nums = listOf<Int>(1,2,3,4,5)

	//Se puede conocer el nùmero de elementos mediante .size
	println(nums.size)

	//Para mostrar un elemento se puede hacer mediante la notaciòn de ìndice
	//o mediante la funciòn get()
	println(nums[2])
	println(nums.get(2))

	//la funciòn indexOf() por el contrario, dado un valor, busca
	//la primer coincidencia en la lista y devuelve el ìndice
	//en el que se encuentra ese valor.
	println(nums.indexOf(5))
	//de no encontrar ningùn ìndice asociado a ese valor devuelve -1

	//sinaxis de for para listas:
	//for(variable in colecciòn){}
	for (numero in nums){
		println(numero)
	}
}

fun mutableList(){
	//sintaxis:
	var numeros = mutableListOf<Int>(10,20,30,40,50)

	//para agregar un elemento se usa add en sus dos variantes
	//add(valor) agrega un elemento al final de la lista
	numeros.add(60)
	//add(indice,valor) agrega el elemento en el indice indicado,
	//los elementos restantes se recorreràn a la derecha
	numeros.add(0,1)

	//para editar un valor se puede acceder al ìndice y modificarlo
	numeros[0] = 5

	//para borrar un elemento, se le pasa el valor a remove()
	//y lo buscarà y borrarà
	numeros.remove(60)
	//mediante removeAt() borrarà el valor que encuentre en el ìndice
	//que le pasemos como argumento
	//y los ìndices de los elementos restantes se recorreràn a la izquierda
	numeros.removeAt(0)

	for(i in numeros){
		println(i)
	}

}