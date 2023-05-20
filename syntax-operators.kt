//Operadores en Kotlin

fun main() {
    
}

fun operadoresAritmeticos(){
    val a = 10
    val b = 20

    //Suma
    println("($a + $b)= ${a + b}")
    //Resta
    println("($a - $b)= ${a - b}")
    //Multiplicaciòn
    println("($a x $b)= ${a * b}")
    //Divisiòn
    println("($a / $b)= ${a / b}")
    //Mòdulo o residuo
    println("($a % $b)= ${a % b}")
}

fun operadoresAsignacionCompuesta(){
	//Sirven para usar como operando a la variable de resultado
	var a = 100
    val b = 5

    //Equivalente a = a + b
    a += b
    println("+= $a")
    //Equivalente a = a - b
    a -= b
    println("-= $a")
    //Equivalente a = a * b
    a *= b
    println("*= $a")
    //Equivalente a = a / b
    a /= b
    println("/= $a")
    //Equivalente a = a % b
    a %= b
    println("%= $a")
}

fun operadoresIncrementoDecremento(){
	var a = 2

	//Prefijo [++a]: Se realiza el incremento sobre la variable 
	//y luego es usada en la expresión que la contiene.

    //Sufijo [a++]: Se usa la variable en la expresión 
    //y luego si se aplica el incremento.
    println("De $a a ${++a}")
    println("De $a a ${a--}")
}

fun operadoresRelacionales(){
	val a = 17
    val b = 20

    println("$a es igual a $b: ${a == b}")
    println("$a es diferente a $b: ${a != b}")
    println("$a es menor que $b: ${a < b}")
    println("$a es mayor que $b: ${a > b}")
    println("$a es menor o igual que $b: ${a <= b}")
    println("$a es mayor o igual que $b: ${a >= b}")
}

fun operadoresLogicos(){
	val input = 5
    var res: Boolean

    val greaterThanZero = input > 0
    val isEven = input % 2 == 0

    //Se usan para comparar dos condiciones

    //Operador "And" ambas condiciones deben ser cumplidas = true
    res = greaterThanZero && isEven
    println("Es mayor que cero y par:$res")
    //Operador "Or" con que una condiciòn se cumpla = true
    res = greaterThanZero || isEven
    println("Es mayor que cero o par:$res")
    //Operador "Not" se usa para negar una condiciòn dada
    res = greaterThanZero && !isEven
    println("Es mayor que cero e impar:$res")
}

fun operadoresNivelBits(){
	val a = 5
    val b = 7

    //And bit a bit
    println("a and b: ${a and b}")
    //Or bit a bit
    println("a or b: ${a or b}")
    //Xor bit a bit
    println("a xor b: ${a xor b}")
    //Not bi a bit
    println("a.inv(): ${a.inv()}")
    //Desplazamiento de bits a la izquierda
    println("a shl b: ${a shl b}")
    //Desplazamiento de bits a la derecha
    println("a shr b: ${a shr b}")
    //Desplazamiento de bits a la derecha sin signo
    println("a ushr b: ${a ushr b}")
}