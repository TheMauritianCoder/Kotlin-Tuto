/**
 * See Level. It can have a default value.
 * Note: If you have defined name and level in the constructor, so you don't have to redefine them in the class itself.
 */
class PlayerType2(var name:String, var level: Int = 6) {
    var lives = 3
    var score = 0

    // This is a function, also called behaviour of a class.
    fun show(){
        // Notice the """" --> The 3 double quotes
        // We use """" to split a string over several lines.
        println("""
            name : $name
            lives : $lives
            level : $level
            score : $score
        """.trimIndent())
        println() // Just to put a space after the print
    }
}