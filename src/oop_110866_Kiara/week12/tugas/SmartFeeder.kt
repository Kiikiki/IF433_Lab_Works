package oop_110866_Kiara.week12.tugas

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Requested Grams must be more than 0 gr." }

    if (isJammed) {
        throw FeederException.DispenserJamException()
    }
    if (requestedGram > availableGram) {
        throw FeederException.FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble successfully given out!")
    return availableGram - requestedGram
}
fun main() {
    var currentKibbleStock = 50

    // schedule 1
    runCatching {
        dispenseKibble(
            80,
            currentKibbleStock,
            false
        )
    }.onSuccess { kibbleLeft ->
        println("Remaining Kibble stock: $kibbleLeft")
    }.onFailure { error ->
        when (error) {
            is FeederException.DispenserJamException -> {
                println("[Error] ${error.message}")
            }
            is FeederException.FoodEmptyException -> {
                println("[Error] ${error.message}")
            }
            else -> {
                println("[Error] ${error.message}")
            }
        }
    }.also {
        println("Morning kibble distribution finished!")
    }

    //schedule 2
    runCatching {
        dispenseKibble(
            30,
            1000,
            isJammed = false
        )
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Afternoon kibble distributed & successfully restocked! Remaining kibble stock: $currentKibbleStock gr")
    }.onFailure { error ->
        println("[Warning] ${error.message}")
        println("Give chicken jerky manually!")
    }

}