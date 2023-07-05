/**
 * Encapsulation Syntax
 */ 

fun main() {
    var persona1: Person = Person("Juan")

    persona1.setName()
    persona1.getName()    
}

class Person (var nameParameter: String){
    private var name: String = ""

    public fun setName(){
        name = nameParameter
    }

    public fun getName(){
        println(name)
    }
}