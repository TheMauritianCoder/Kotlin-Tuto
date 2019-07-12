fun main(args: Array<String>) {

    var ravi : Player = Player("ravi",1)

    val redPotion = Loot("Red Potion",LootType.POTION,7.50)
    val chestArmor= Loot("Chest Armor",LootType.ARMOR,80.00)

    ravi.inventory.add(redPotion)
    ravi.inventory.add(chestArmor)
    ravi.showInventory()

    ravi.inventory.add(Loot("Ring of Perfection",LootType.RING,40.25))
    ravi.inventory.add(Loot("Invisibility Potion",LootType.POTION,35.95))
    ravi.showInventory()


    // for loops
    println("************ IN ************")
    for(i in 0..10){
        println("$i x $i--> ${i*i}")
    }

    println("************ UNTIL ************")
    for(i in 0 until 10){ // Will stop at 9. With until, the ending value is NOT in the range.
        println("$i x $i--> ${i*i}")
    }

    println("************ DOWN TO ************")
    for(i in 10 downTo 0){ // Loops in reverse order. Includes 10 and 0
        println("$i x $i--> ${i*i}")
    }

    println("************ STEPS ************")
    for(i in 10 downTo 0 step 2){ // Note we cannot have negative value for steps, to reverse. This is what down to is for.
        println("$i x $i--> ${i*i}")
    }

    /**
     * Challenge:
     *      Create a for loop that prints out all the numbers from 0 to 100 that are divisible by BOTH 3 and 5.
     */
    println("************ CHALLENGE ************")
    for(value in 3..100 step 3){
        if(value % 5 == 0){
            println("$value is divisible by both 3 and 5")
        }
    }
}