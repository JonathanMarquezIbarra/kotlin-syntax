fun main(){
	val cadena:String = "Hola que tal, como te va?"
	val regex = "^H".toRegex()
    
    if (regex.containsMatchIn(cadena)){
        println("La cadena de caracteres empieza con la letra H.")
    } else {
        println("La cadena no cumple con la condiciòn.")
    }
	

	val numeros: String = "456789"    
    var regExpression = "[0-3]".toRegex()
    
	if (regExpression.containsMatchIn(numeros)){
        println("La numeraciòn del 0 al 3 existe!!")
    } else {
        println("no hay nùmeros del 0 al 3")
    }
}