fun main(args: Array<String>) {

    val ravi = Player("Ravi",1)
    ravi.pickLoot(Loot("Invisibility",LootType.POTION,4.0))
    ravi.pickLoot(Loot("Mithril",LootType.ARMOR,183.0))
    ravi.pickLoot(Loot("Ring of Speed",LootType.RING,25.0))
    ravi.pickLoot(Loot("Red Potion",LootType.POTION,2.0))
    ravi.pickLoot(Loot("Cursed Shield",LootType.ARMOR,-8.0))
    ravi.pickLoot(Loot("Brass Ring",LootType.RING,1.0))
    ravi.pickLoot(Loot("Chain Mail",LootType.ARMOR,4.0))
    ravi.pickLoot(Loot("Gold Ring",LootType.RING,12.0))
    ravi.pickLoot(Loot("Health Potion",LootType.POTION,3.0))
    ravi.pickLoot(Loot("Silver Ring",LootType.RING,6.0))

    ravi.showInventory()

    val dracula = VampireKing("Dracula")
    println(dracula)


    for(i in 1..10){ // This is for loop with a range of values.
        while(dracula.lives > 0){
            if(dracula.dodges()){
                continue
            }
            if(dracula.runAway()){
                println("Dracula ran away...")
                break
            }else{
                dracula.takeDamage(12)
            }
        }
        println("---------------------------------------------")
    }
}