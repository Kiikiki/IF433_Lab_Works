package oop_110866_Kiara.week10.tugasMandiri

class WalletRepository<T>(private val items: MutableList<T> = mutableListOf()) {
    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
}
