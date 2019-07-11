fun main(args: Array<String>) {
    println("Hello World")

    // Init on declaration.
    var firstname : String = "Ravi"
    println(firstname)

    // Init on assignment.
    var lastname : String
    lastname = "Kowlessur"
    println(lastname)

    // Numeric type
    var age : Int = 28
    println("Age --> ${age}")

    var monthlyBasicSalary: Int = 1000
    var monthlyTransport: Int = 550
    println("Gross Salary --> ${monthlyBasicSalary + monthlyTransport}")

    // Note: Int can only store whole numbers or integers same as Java.
    println("Division Test 1 --> ${monthlyBasicSalary / monthlyTransport}")

    // Note: To get the decimals, Double is used. There's Float, but double is the most commonly used.
    var num1 : Int = 10
    var num2 : Double = 3.0 // .0 or .<anything> is mandatory
    println("Division Test 2 --> ${num1 / num2}")

    println("Division Test 2 Concat. --> "+(num1 / num2)) // String concatenation
    //println((num1 / num2)+"Division Test 2 --> ") // Seems concatenation, but will not work because you cannot concatenate on Numerics
    println("Division Test 2 Interp. Variable --> $num1") // String Interpolation with variable
    println("Division Test 2 Interp. Cal --> ${num1 / num2}") // String Interpolation with a calculation

}