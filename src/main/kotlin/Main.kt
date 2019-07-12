fun main(args: Array<String>) {

    val raviPlayerType1 = PlayerType1("Ravi Player Type 1") // Creating a new instance of the class PlayerType1

    // Output with println on each field separately
    println(raviPlayerType1.name)
    println(raviPlayerType1.lives)
    println(raviPlayerType1.level)
    println(raviPlayerType1.score)
    println()

    // Now calling te function show of the class PlayerType1
    raviPlayerType1.show();

    val roubinaPlayerType1 = PlayerType1("Roubina Player Type 1")
    roubinaPlayerType1.level = 5
    roubinaPlayerType1.show();

    val raviPlayerType2 = PlayerType2("Ravi Player Type 2")
    raviPlayerType2.show()

    val roubinaPlayerType2 = PlayerType2("Roubina Player Type 2",5)
    roubinaPlayerType2.show()

    println("------------------------Player 1 Weapons ---------------------------------------")
    println("Weapon --> ${raviPlayerType1.weapon.name}, Damage --> ${raviPlayerType1.weapon.damangeInflicted}");

    var axe : Weapon = Weapon("Axe",12)
    raviPlayerType1.weapon = axe
    println("Weapon --> ${raviPlayerType1.weapon.name}, Damage --> ${raviPlayerType1.weapon.damangeInflicted}");

    // Notice axe refers to the same object as raviPlayerType1.weapon, this is why when we changed the damage after th assignment, the inflicted value still changed for raviPlayerType1
    axe.damangeInflicted = 5
    println("Weapon --> ${raviPlayerType1.weapon.name}, Damage --> ${raviPlayerType1.weapon.damangeInflicted}");

    raviPlayerType1.weapon = Weapon("sword",24)
    println("Weapon --> ${raviPlayerType1.weapon.name}, Damage --> ${raviPlayerType1.weapon.damangeInflicted}");

}