//Crear un atributo booleano que nos permita saber si aun seguimos vivos, la variable debe ser unicamente de lectura.
//Utilizaremos ese valor para elegir si colisionar con un goomba en el ciclo for
val isAlive: Boolean
get() {
  return lives>=1
}

if (Mario.isAlive){
  mario.collision(collisionObj)
