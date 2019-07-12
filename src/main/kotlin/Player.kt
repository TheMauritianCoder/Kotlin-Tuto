class Player (val name : String, var level: Int) {

    var lives : Int = 3
    var score : Int = 0
    var weapon : Weapon = Weapon("Fist", 1)
    val inventory = ArrayList<Loot>()

    //Overriding toString Method
    override fun toString(): String {
        return """
            name : $name
            lives : $lives
            level : $level
            score : $score
            ****** weapon details ****** $weapon
            ****** Inventory details ****** $inventory
        """
    }
}