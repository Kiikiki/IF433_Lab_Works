package oop_110866_Kiara.week08

fun main() {
    println("=== Test Safe calls & Elvis ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Unknown City"
    println("destination: $destination")

    println("\n=== Test Let Block ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "[Valid Transaction] price: Rp.$price, tax: Rp.$tax"
    } ?: "[Invalid Transaction]: Price is not set!"

    println(receipt)

    println("\n=== Test Safe Casting ===")
    val mixedData: List<Any> = listOf(
        "smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )
}
