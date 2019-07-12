fun main(args: Array<String>) {

    var ravi : Player = Player("ravi",1)

    val redPotion = Loot("Red Potion",LootType.POTION,7.50)
    val chestArmor= Loot("Chest Armor",LootType.ARMOR,80.00)

    ravi.pickLoot(redPotion)
    ravi.pickLoot(chestArmor)
    ravi.showInventory()

    ravi.pickLoot(Loot("Ring of Perfection",LootType.RING,40.25))
    ravi.pickLoot(Loot("Invisibility Potion",LootType.POTION,35.95))
    ravi.showInventory()

    if(ravi.dropLoot(redPotion)){
        println("*********** $redPotion has been deleted ************d")
    }else{
        println("You don't have the item $redPotion")
    }
    ravi.showInventory()


    val bluePotion = Loot("Blue Potion",LootType.POTION,7.50)
    if(ravi.dropLoot(bluePotion)){
        println("*********** $bluePotion has been deleted ************d")
    }else{
        println("You don't have the item $bluePotion")
    }

    ravi.pickLoot(bluePotion)
    ravi.showInventory()

    ravi.dropLoot("Blue Potion")

}