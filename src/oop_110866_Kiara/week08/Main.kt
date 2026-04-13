package oop_110866_Kiara.week08

fun main() {
    println("=== Test Safe calls & Elvis ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Unknown City"
    println("destination: $destination")
}