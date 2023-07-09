
fun main() {
    var myHome: House = House()    
    myHome.build()
    
    var myPool: Pool = Pool()
    myPool.build()
}

//Una clase abstracta no tiene cuerpo, pero las clases que hereden de ella
//forzosamente deben implementar su cuerpo

//Una función dentro de una clase abstracta no necesariamente tiene que ser abstracta también
//pero si se usa una función abstracta dentro de una clase, la clase está obligada a ser abstracta
abstract class Edification (){
    
    abstract fun build()
}

class House () : Edification(){
    //para implementar el cuerpo de la función abstracta build() sebe sobre escribirse
    override fun build(){
        println("The house is building right now...")
    }
    
}

class Pool () : Edification(){
    
    override fun build(){
        println("The pool is building right now...")
    }
    
}