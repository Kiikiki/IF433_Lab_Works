package oop_110866_Kiara.week07

class NetworkClient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "http://api.umn.ac.id"

        fun createClient(): NetworkClient {
            println("Building a network client using BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }

    fun connect() {
        println("Connecting to $url...")
    }
}