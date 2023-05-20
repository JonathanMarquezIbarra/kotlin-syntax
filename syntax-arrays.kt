
fun main() {
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
