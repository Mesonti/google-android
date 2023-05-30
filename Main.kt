fun main() {
    val myFirstDice = Dice()
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}!")


    myFirstDice.sides = 20
    println("Your ${myFirstDice.sides} sided dice rolled ${myFirstDice.roll()}!")

}