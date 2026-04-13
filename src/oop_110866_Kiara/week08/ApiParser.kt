package oop_110866_Kiara.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        //extract id & name
        val id =  requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }
        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name"
        }

        //extract type
        val type = rawJson["type"] as? String

        if (type == "ELECTRONIC") {
            val warranty = rawJson["warrantyMonths"] as? Int ?: 12
            return Electronic(id, name, warranty)
        }

        if (type == "CLOTHING") {
            val size = rawJson["size"] as? String ?: "All Size"
            return Clothing(id, name, size)
        }

        return null
    }

    fun checkout(product: Product) {
        //extract id
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        val transactionId = JavaPaymentService.processPayment(id)!!
        println(transactionId)
    }
}



