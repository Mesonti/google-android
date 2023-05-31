class Dice(val numSides: Int) {


    fun coloring(): String {
        return mapOf(
            1 to "Green",
            2 to "Yellow",
            3 to "Purple",
            4 to "Brown",
            5 to "Black",
            6 to "Pink",
        ).values.random()
    }

    fun roll(): Int {
        return(1..numSides).random()
    }
}