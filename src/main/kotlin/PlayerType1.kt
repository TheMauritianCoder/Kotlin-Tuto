class PlayerType1(val name: String){ // Tells that when player is created, we need to provide a variable "name".
    var lives = 3
    var level = 1
    var score = 0

    var weapon : Weapon = Weapon("Fist", 1)

    // This is a function, also called behaviour of a class.
    fun show(){
        // Notice the """" --> The 3 double quotes
        // We use """" to split a string over several lines.
        println("""
            name : $name
            lives : $lives
            level : $level
            score : $score
            weapon name: ${weapon.name}
            weapon damage: ${weapon.damangeInflicted}
        """.trimIndent())
        println() // Just to put a space after the print
    }
}