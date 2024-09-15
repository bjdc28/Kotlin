fun main() {

    val firstNumber = 15.5f
    val secondNumber = 3.5f

    val text1 = "Beginning"
    val text2 = " Middle "
    val text3 = "End"

//    Arithmetic Operators

    println("+ - * / %")
    println("$firstNumber + $secondNumber = ${firstNumber + secondNumber}")
    println("$firstNumber - $secondNumber = ${firstNumber - secondNumber}")
    println("$firstNumber * $secondNumber = ${firstNumber * secondNumber}")
    println("$firstNumber / $secondNumber = ${firstNumber / secondNumber}")
    println("$firstNumber % $secondNumber = ${firstNumber % secondNumber}")

    println(text1 + text2 + text3)
    println("----------")
    assignmentOperator()
    println("----------")
    numericPrefix()
    println("----------")
    comparisonOperators()
    println("----------")
    inOperator()
}


fun assignmentOperator() {
//    Assignment Operators
    var total = 0

    total +=5
//  outputs 5
    println(total)

    total -= 3
//  outputs 2
    println(total)

    total *= 25
//  outputs 50
    println(total)

    total /= 5
//  outputs 10
    println(total)

    total %= 3
//  outputs 10
    println(total)

}


fun numericPrefix(){

    var total = 25 + (-30)
//    outputs -5

    ++total
//    outputs -4
    --total
//    outputs -5

    println(total++)
//    does increment/decrement after completing line
    println(total)

    var isWorking = false

    if (!isWorking){
//        checks if isWorking is false
        println("Something doesn't work")
    }

}


fun comparisonOperators(){
    var number = 10
    var biggerNumber = 12
    var randomNumber = (1..20).random()

    if (number > biggerNumber){
        println("number is more than biggerNumber")
    }
    if (number < biggerNumber){
        println("number is less than biggerNumber")
    }
    if (number >= biggerNumber){
        println("number is more than or equal to biggerNumber")
    }
    if (number <= biggerNumber){
        println("number is less than or equal to biggerNumber")
    }
    if (number == biggerNumber){
        println("number is equal to biggerNumber")
    }
    if (number != biggerNumber){
        println("number is not equal to biggerNumber")
    }
    if (number < biggerNumber && number < randomNumber){
        println("number is less than biggerNumber and less than randomNumber")
    }
    if (number < biggerNumber || number > biggerNumber){
        println("one of the statement is true if this printed")
    }
}


fun inOperator(){
    var numbers = listOf(1, 3, 10, 20)
    var randomNumber = (1..20).random()

    if (randomNumber in numbers){
        println("randomNumber is in the list of numbers!")
    } else{
        println("randomNumber is not in the list of numbers!")
    }

    println(randomNumber) //printing randomNumber
    println(numbers[0]) //printing from the list of numbers [0], [1], [2], [3]

//    if (randomNumber !in numbers){
//        println("randomNumber is not in the list of numbers!")
//    }

}