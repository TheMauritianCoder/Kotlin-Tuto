class Weapon (val name: String, var damangeInflicted: Int){


    fun show(){
        println("""
            name : ${name}
            damage: ${damangeInflicted}
        """.trimIndent())
    }
}