package oop_110866_Kiara.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )


    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            product?.let {
                parser.checkout(it)
            } ?: println("API Invalid: type not found")
        }
        catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
}

//output
//TRX-E01-SUCCESS
//TRX-C01-SUCCESS
//TRX-E02-SUCCESS
//API Invalid: Missing ID -> from parser since return "API Invalid: Missing ID" if id is null/missing
// -> prints nothing because ?.let means do not let it be null, if null ignore it
//so i added an else statement to make it appear if a type mistake happen since in API it just return null

//current output
//TRX-E01-SUCCESS
//TRX-C01-SUCCESS
//TRX-E02-SUCCESS
//API Invalid: Missing ID
//API Invalid: type not found