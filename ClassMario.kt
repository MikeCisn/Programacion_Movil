import java.util
import java.


class Mario (var vidas: Int =3){
    int {
        println("It's a me! Mario!")
    }
    private var states = "small"
    private var lives =3 
    
    private fun die (){
        lives-- 
        println("Has perdido una vida!")
    }
    public fun collision (collisionObj: String){
        when (collisionObj){
            "Goomba"-> die()
            "Super Mushroom" -> state = "Super Martio"
            "Fire flower" -> state = "Fire Mario"
            else -> println("Objeto descopnocido ¡no pasa nada!")
        }
    }
}

fun main() {
    var mario = Mario()
    mario.collision(collisionObj:"pipe")
    mario.collision(collisionObj:"Goomba")
    println("te quedan ${mario.getLives()}")
    
}

    for (i in 1..5){
        mario.collision("Goomba")
        println("Te quedan ${Mario.getLives()}")
    }
