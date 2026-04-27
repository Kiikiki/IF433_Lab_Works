package oop_110866_Kiara.week10.tugasMandiri

class WalletRepository<T>{
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(name: String): List<T> {
        return items.filter {
            when (it) {
                is Coin -> it.name.contains(name, ignoreCase = true)
                is Transaction -> it.id.contains(name, ignoreCase = true)
                else -> false
            }
        }
    }
}
