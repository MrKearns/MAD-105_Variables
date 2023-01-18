fun main(args: Array<String>) {

    var myByte: Byte = -17
    var myShort: Short = 16
    var myInt = 15000
    var myLong = 100000000000000000L
    var myFloat = 20.53F
    var myDouble = 1.87
    var myBool = true
    var myChar: Char  = 'a'

    println("\nHere's a list of variable types and examples.")
    println("$myByte is a byte")
    println("$myShort is a short")
    println("$myInt is a int")
    println("$myLong is a long")
    println("$myFloat is a float")
    println("$myDouble is a double")
    println("$myBool is a bool")
    println("$myChar is a char\n")

    println("Program arguments: ${args.joinToString()}")
}