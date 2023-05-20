
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
