fun main(args: Array<String>) {

//    val enemy = Enemy("Enemy 1",10,3)
//    println(enemy)
//
//    enemy.takeDamage(4)
//    println(enemy)
//
//    enemy.takeDamage(11)
//    println(enemy)

    val uglyTroll = Troll("Ugly Troll")
    uglyTroll.takeDamage(30)
    println(uglyTroll)
    println()

    val vampire = Vampire("Vladi")
    vampire.takeDamage(30)
    println(vampire)
    println()

    val dracula = VampireKing("Dracula")
    dracula.takeDamage(30)

    while(dracula.lives > 0){
        dracula.takeDamage(10)
    }

}