import java.util
import java.kotlin
package clases

class Mario (var vidas : Int =3){
    init {
        println("It's a me! Mario!")
    }
    private var state = "small"
    private var lives =3

    private fun die (){
        lives--
        println("Has perdido una vida!")
    }
    public fun collision (collisionObj: String){
        when (collisionObj){
            "Goomba"-> die()
            "Super Mushroom" -> state = "Super Mario"

            "Fire flower" -> state = "Fire Mario"

            else -> println("Objeto descopnocido ¡no pasa nada!")

        }
    }
    fun getLives(): String {
        return "$lives vidas"

    }
}
__________________________

fun main() {
    var mario = Mario ()
    //mario.collision( "Pipe")
    //mario.collision("Goomba")
    //println("Te quedan ${mario.getLives()}")
    for (i in 1..5)
        mario.collision("Goomba")
    println("Te quedan ${mario.getLives()}")

}
