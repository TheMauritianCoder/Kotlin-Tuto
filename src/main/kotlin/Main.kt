fun main(args: Array<String>) {

    // ---------------- IF CONDITION ----------------
    val lives = 2
    var isGameOver = (lives < 1) // isGameOver is a boolean.

    println("isGameOver --> $isGameOver")

    if(isGameOver){
        println("Game Over")
    }else {
        println("Number of life left = $lives")
    }


    // ---------------- IF-ELSE IF-ELSE ----------------
    println("How old are you?")
    // This is used to get the value from the commmand line and convert it to Int.
    //If you input a non Int, you will get a NumberFormatException
    var age = readLine()!!.toInt()
    println("Your age is $age")

    var message : String

    if(age < 18){
        message = "You are too young -_-"
    }else if(age > 150){
        message = "You are dead !! :'( "
    }else{
        message = "You are IN !! :D"
    }
    println(message)

    // ---------------- WHEN ----------------
    println("************ starting test2....")
    println("How old are you?")
    // This is used to get the value from the commmand line and convert it to Int.
    //If you input a non Int, you will get a NumberFormatException
    age = readLine()!!.toInt()
    println("Your age is $age")

    message = when {
        age < 18 -> "You are too young -_-"
        age > 150 -> "You are dead !! :'( "
        else -> "You are IN !! :D"
    }

    println(message)
}