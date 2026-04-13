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

    for (item in mixedData) {
        val text = item as? String

        text?.let {
            println("Text found: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100
    val safeString = someObject as? String ?: "Unknown String"
    println("Cast Result + fallback: $safeString")
    //works

    println("\n=== Test The Red Button (!!) ===")
    val toxicData: String? = null
    try {
        val length = toxicData!!.length
    }
    catch (e: NullPointerException) {
        println("CRASH (NPE)! Don't USE! Willy nilly!")
    }

    val apiResponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try {
        val token = requireNotNull(apiResponse["token"]) {
            "CRITICAL EXCEPTION: token authentication isn't found from the server"
        }
    }
    catch (e: IllegalArgumentException) {
        println(e.message)
    }

    println("\n=== Test JAVA Interoperability ===")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()
    val statusLength = javaResponse!!.length
    println("Status dari Java: $javaResponse (length: $statusLength)")

    //running unit test
    runMockUnitTest()
}
