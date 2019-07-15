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
        println("********* Showing Inventory *********")
        var total : Double = 0.0
        for (item in inventory){
            println(item)
            total += item.value
        }
        println("================================")
        println("Total Value = $total")
        println("================================")
    }

    fun pickLoot(item : Loot){
//        println("Picking Loot --> ${item.name}")
//        println("")
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

    // Overloading
    fun dropLoot(name : String):Boolean{
        println("$name will be dropped")
        return inventory.removeIf { it.name == name } // just like stream in java
    }
}