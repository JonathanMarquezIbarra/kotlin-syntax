
fun main() {
    //Se crean objetos de tipo Person
    var police: Person = Person("Jeremías", 16, 899445667)
    var medic: Person = Person("Felipe", 53, 741258964)
    //Se crea una lista mutable que va a contener objetos de tipo persona
    var personsList: MutableList<Person> = mutableListOf()
    //Se agregan los objetos persona a la lista
    personsList.add(police)
    personsList.add(medic)
    //esta es otra forma de agregar objetos a la lista y al mismo tiempo
    //mandarle argumentos al objeto para su creación
    personsList.add(Person("Verónica", 21, 16458976))
    //se manda la lista a la función que la imprime
    printPersonsList(personsList)

}

// CONSTRUCTOR IMPLICITO
/*
class Person (){
    var name: String = ""
    var age: Int = 0
    var phone: Int = 0

    fun caminar(){
        println("La persona está caminando...")
    }

    fun imprimirDatos(){
        println("Nombre: $name \nEdad: $age \nTeléfono: $phone \n ")
    }
}
*/

// CONSTRUCTOR EXPLICITO
class Person (name: String, age: Int, phone: Int){
    var name: String = name
    var age: Int = age
    var phone: Int = phone

    //constructor por defecto que se usa por si no se le mandan
    //argumentos a la función
    constructor():this("", 0, 1111111111){
        println("Estamos adentro del constructor...")
    }
    // se ejecuta después del constructor de la clase
    init {
        //this.age se refiere a la variable age que va llegando
        //como parámetro en el constructor explícito de la clase
        if ( this.age < 18){
            println("La persona debe ser mayor de edad!!")
        }
    }

    fun caminar(){
        println("La persona está caminando...")
    }
    fun imprimirDatos(){
        println("Nombre: $name \nEdad: $age \nTeléfono: $phone \n ")
    }
}

fun printPersonsList(personsList: MutableList<Person> = mutableListOf()){
    for (i in 0..personsList.size-1){
        println("${personsList[i].name} \n${personsList[i].age} \n${personsList[i].phone}")
        println("")
    }
}