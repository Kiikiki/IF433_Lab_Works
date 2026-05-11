package oop_110866_Kiara.week12.tugas

sealed class FeederException(msg: String) : Exception(msg) {
    class FoodEmptyException(requested: Int, available: Int) : FeederException("Kibble isn't enough! Request $requested gr, Available $available gr")
    class DispenserJamException : FeederException("[Error] Dispenser got jammed!")
}

