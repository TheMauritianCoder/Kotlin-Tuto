fun main(args: Array<String>) {

    var ravi : Player = Player("ravi",1)

    val redPotion = Loot("Red Potion",LootType.POTION,7.5)
    ravi.inventory.add(redPotion)
    println(ravi)
}