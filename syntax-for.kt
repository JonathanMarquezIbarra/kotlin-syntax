
fun main() {
    //Sintaxis bàsica de un arreglo
    val arreglo = arrayOf<Int>(23,12,67,89,1)
    
    //Con la funciòn set sirve para cambiar un valor
    // recibe dos argumentos, primero la posiciòn
    // y despuès el nuevo valor que se le asignarà
    // en este caso, en el ìndice 0, se le asigna el valor de 5
    arreglo.set(0, 5)
    
    //arreglo.size se refiere al tamaño del arreglo
    //se usa size-1 por que el tamaño del arreglo es de 5
    //y si contamos del 0 al 5 son 6 espacios y se sale del arreglo
    //
    //la expresion 0 .. arreglo.size-1 es equivalente a arreglo.indices
    for (i in 0 .. arreglo.size-1){
        //la funciòn get sirve para obtener el valor almacenado en
        //una posiciòn
        println(arreglo.get(i))
    }
    
    //con la expresiòn .withindex permite imprimir simultàneamente
    //la posiciòn y su respectivo valor, para ello se le declaran
    //dos paràmetros en el for
        for ((posicion, valor) in arreglo.withIndex()) {
        println("La posición $posicion contiene el valor $valor")
    }
}

fun operations(){
    //se declaran dos arreglos con sus respectivos valores
    val array1 = arrayOf<Int>(1,2,3,4,5)
    val array2 = arrayOf<Int>(5,4,3,2,1)
    //se declara un arreglo que sumarà a los dos arreglos anteriores
    val arrayAddition = array1 + array2
    //se muestra el arreglo 1
    for (i in 0..array1.size-1){
        println(array1[i])
    }    
    println(" ")
    //se muestra el arreglo 2
    for (i in 0..array2.size-1){
        println(array2[i])
    } 
    //se muestra el arreglo suma, que queda de la siguiente manera
    //  [arrayAddition] = [array1|array2]
    println(" ")
    for (i in 0..arrayAddition.size-1){
        println(arrayAddition[i])
    }
    println("El tamaño del arreglo suma es de $arrayAddition.size ìndices.")
}