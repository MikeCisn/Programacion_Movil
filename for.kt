fun main(){
    val nombres = list0f(
        "kirby",
        "Ness",
        "Fox",
        "Luigi",
        "Mario",
        "Link",
        "Captitan Falcon",
        "Samus",
        "Pikachu"
        "Jigglypuff",
        "Donkey Kong",
        "Yoshi",
    )
    for (nombre in nombres){
        println(nombre)
        if (nombre=="Link"){
            println("Personaje Encontrado!")
            break
        }
    }
}
