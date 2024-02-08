

fun main() {
    // Question 01
    println("Question 01")
    // First I prompt the user to enter their age.
    print("How old are you, please enter your age: ")
    // The entered age is stored og passed to the canVote function to test if the user can vote or not.
    val enteredAge = Integer.valueOf(readlnOrNull())
    canUserVote(enteredAge)
    println()
    // Question 2
    println("Question 02")
    println("Highest number in the list")
    getMax(listOfThreeNumbers)
    println("Lowest number in the list")
    getMin(listOfThreeNumbers)
    println()
    // Question 03
    println("Question 03")
    println(calculateAverage(testListOfNumbers))
    println()
    // Question 04
    println("Question 04")
    println(isValidCPRNumber(1213960000))
    println()
    // Question 05
    println("Question 05")
    fizzBuzz()
    println()
    // Question 06
    println("Question 06")
    println(nameAbbreviator("Christian Bjerre Thellefsen"))
    println(nameAbbreviator("Lasse Graubæk Gamer"))
    println()
    // Question 07
    println("Question 07")
    println(autoGrader(99))
    println()
    // Question 08
    println("Question 08")
    val wordList: List<String> = listOf("Modular", "HelloHello", "Gamer", "Monner", "WorldWorld")
    println(filterWordsByLength(wordList, 7))
    println()

}
// 01
//A person is elligible to vote if his/her age is greater than or equal to 18.
//Define a method to find out if he/she is elligible to vote.
// Let the user input their age.

fun canUserVote(age: Int) {
    if (age >= 18) {
        println("You are old enough to vote")
    } else {
        println("You are not old enough to vote")
    }
}

// 02
// Define two functions to print the maximum and the minimum number respectively among three numbers.
// Making a list with three numbers to use in functions.
val listOfThreeNumbers: List<Int> = mutableListOf(1, 18, -8)

//
fun getMax(listOfThreeNumbers: List<Int>) {
    var highestNumber: Int = listOfThreeNumbers[0]
    for (number in listOfThreeNumbers) {
        if (number > highestNumber) {
            highestNumber = number
        }
    }
    println(highestNumber)
}

//
fun getMin(listOfThreeNumbers: List<Int>) {
    var lowestNumber: Int = listOfThreeNumbers[0]
    for (number in listOfThreeNumbers) {
        if (number < lowestNumber) {
            lowestNumber = number
        }
    }
    println(lowestNumber)
}

// 03
// Write a Kotlin function named calculateAverage that takes in a list of numbers and returns their average.

var testListOfNumbers: List<Int> = mutableListOf(3, 34, 54, 12, 11, 9, 22, 90)

fun calculateAverage(listOfNumbers: List<Int>): Float {
    var sumOfList = 0
    for (number in listOfNumbers) {
        sumOfList += number
    }
    val listAverage: Float = sumOfList.toFloat() / listOfNumbers.size
    return listAverage
}

// 04
// Write a method that returns if a user has input a valid CPR number.
// A valid CPR number has:
//      10 Digits.
//      The first 2 digits are not above 31.
//      The middle 2 digits are not above 12.
// The method returns true if the CPR number is valid, false if it is not.

fun isValidCPRNumber(cprNumber: Int): Boolean {

    val cprString: String = cprNumber.toString()


    return !(cprString.length != 10 || cprString.substring(0, 2).toInt() > 31 || cprString.substring(2, 4).toInt() > 12)

}


// 05
// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

fun fizzBuzz() {
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}

// 06
// Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is.
// For example, if your name is Robert Brett Roser, then the output should be R.B. Roser. Or Benjamin Dalsgaard Hughes will be B.D. Hughes

fun nameAbbreviator(fullName: String): String {
    val nameList: List<String> = fullName.split(" ")
    val abbreviatedName = StringBuilder()
    for ((index, name) in nameList.withIndex()) {
        if (index != nameList.size - 1) {
            abbreviatedName.append("${name[0]}. ")
        } else {
            abbreviatedName.append(name)
        }
    }
    return abbreviatedName.toString()
}

// 07
// Write a program that takes a numerical grade (0-100) as input and prints out the corresponding american letter grade.
// Implement a function calculateGrade that takes an integer parameter representing the grade and returns a string representing the letter grade according to the following scale:
//      90-100: "A"
//      80-89: "B"
//      70-79: "C"
//      60-69: "D"
//      Below 60: "F"

fun autoGrader(score: Int): String {

    val gradesMap = mapOf(
            90..100 to "A",
            80..89 to "B",
            70..79 to "C",
            60..69 to "D",
            0..59 to "F"
    )

    for ((gradeScore, letterGrade) in gradesMap) {
        if (score in gradeScore) {
            return letterGrade
        }
    }
    return "Not valid score"
}

// 08
// Write a Kotlin function named filterWordsByLength that takes in a list of strings and a minimum length,
// and returns a list containing only the words that have a length greater than or equal to the specified minimum length.
// Use filter function and lambda expressions

fun filterWordsByLength (listOfStrings: List<String>, minimumLength: Int): List<String> {
    return listOfStrings.filter { word: String -> word.length >= minimumLength }
}



