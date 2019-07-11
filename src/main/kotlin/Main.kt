fun main(args: Array<String>) {

    val raviPlayer1 = PlayerType1("Ravi") // Creating a new instance of the class PlayerType1

    // Output with println on each field separately
    println(raviPlayer1.name)
    println(raviPlayer1.lives)
    println(raviPlayer1.level)
    println(raviPlayer1.score)
    println()

    // Now calling te function show of the class PlayerType1
    raviPlayer1.show();

    val roubinaPlayerType1 = PlayerType1("Roubina")
    roubinaPlayerType1.level = 5
    roubinaPlayerType1.show();


}