class Coin() {

    val sides = 2

    fun roll(): String {
        return mapOf(1 to "Eagle", 2 to "Tail").values.random()
    }
}