package oop_110866_Kiara.week01

fun main() {
    //note not sure if input should be added so default input
    val gameTitle = "Minecraft"
    val price = 320000

    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int {
    if(price > 500000) {
        return price * 80 / 100 //20% discount
    }
    else {
        return price * 90 / 100 //10% discount
    }
}

fun printReceipt(title: String, finalPrice: Int) {
    println("Title: $title, Final Price: $finalPrice")
}