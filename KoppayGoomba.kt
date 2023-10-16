class Goomba:
    Enemy("Goomba",1){
        init {
            println("iniciando subclase de $name")
        }
    }
class Koopa:
Enemy("Koopa",2) {
      init {
        println("iniciando subclase de $name")
    }
    override fun collision (collider: String) {
        when (collider){
            "Weapon"->{
                val state = "Shell"
                println("El estado es ahora $state")
            }
            "Enemy"-> changeDirection()
        }
    }
}
