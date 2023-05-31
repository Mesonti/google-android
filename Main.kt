fun main() {
    val myFirstDice = Dice(6)
    println("Your $myFirstDice sided dice rolled ${myFirstDice.roll()}!Look he have a ${myFirstDice.coloring()} color")

    val mySecondDice = Dice(20)
    println("Your $mySecondDice sided dice rolled ${mySecondDice.roll()}!Look he have a ${mySecondDice.coloring()} color")

}