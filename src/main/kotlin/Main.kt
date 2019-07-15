fun main(args: Array<String>) {

    val dracula = VampireKing("Dracula")
    println(dracula)

    // In Do While loop, the loop is executed at least once.
    dracula.lives = 0
    do {
        if (dracula.dodges()) {
            dracula.lives += 1
            continue
        }
        if (dracula.runAway()) {
            println("Dracula ran away...")
            break
        } else {
            dracula.takeDamage(12)
        }
    } while (dracula.lives > 0)
    println("---------------------------------------------")
}