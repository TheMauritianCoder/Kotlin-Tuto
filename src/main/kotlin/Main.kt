fun main(args: Array<String>) {
    println("Hello World")

    // Init on declaration.
    val firstname : String = "Ravi"
    println(firstname)

    // Init on assignment.
    val lastname : String
    lastname = "Kowlessur"
    println(lastname)

    // Numeric type
    val age : Int = 28
    println("Age --> ${age}")

    val monthlyBasicSalary: Int = 1000
    val monthlyTransport: Int = 550
    println("Gross Salary --> ${monthlyBasicSalary + monthlyTransport}")

    // Note: Int can only store whole numbers or integers same as Java.
    println("Division Test 1 --> ${monthlyBasicSalary / monthlyTransport}")

    // Note: To get the decimals, Double is used. There's Float, but double is the most commonly used.
    val num1 : Int = 10
    val num2 : Double = 3.0 // .0 or .<anything> is mandatory
    println("Division Test 2 --> ${num1 / num2}")

    println("Division Test 2 Concat. --> "+(num1 / num2)) // String concatenation
    //println((num1 / num2)+"Division Test 2 --> ") // Seems concatenation, but will not work because you cannot concatenate on Numerics
    println("Division Test 2 Interp. Variable --> $num1") // String Interpolation with variable
    println("Division Test 2 Interp. Cal --> ${num1 / num2}") // String Interpolation with a calculation

    // Difference between Val and Var
    // val --> Stands for Value --> Immutable --> i.e cannot be changed
    // var --> Stands for Variable --> Stands for variable --> i.e. Value can change.
    // As a rule of thumb, always use val unless you know the value will change.
    var x : Int = 0
    println("x --> $x")
    x = 1
    println("x --> $x")

    val y : Int = 0
    /* y = 1 // This will now give an error because you cannot chane the value of val. */
    println("y --> $y")

    // You don't explicitly have to specify the type. Kotlin is intelligent enough to imply it by itself.
    val stringVal = "This is a string variable"
    val intVal = 1
    val doubleVal = 1.0
}