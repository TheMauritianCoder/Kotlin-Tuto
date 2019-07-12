class Player (val name : String, var level: Int) {

    var lives : Int = 3
    var score : Int = 0
    var weapon : Weapon = Weapon("Fist", 1)

    private val inventory = ArrayList<Loot>()

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

    fun showInventory(){
        for (item in inventory){
            println(item)
        }
        println("...")
    }

    fun pickLoot(item : Loot){
        inventory.add(item)
    }

    fun dropLoot(item : Loot):Boolean{
        return if(inventory.contains(item)){
            inventory.remove(item)
            true
        }else{
            false
        }
    }
}