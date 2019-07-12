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
}