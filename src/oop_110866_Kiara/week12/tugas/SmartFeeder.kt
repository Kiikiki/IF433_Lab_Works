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