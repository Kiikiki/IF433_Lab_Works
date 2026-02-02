package oop_110866_Kiara.week01

fun main() {
    //note not sure if input should be added so default input
    val gameTitle = "Minecraft"
    val price = 320000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int {
    if(price > 500000) {
        return price * 0,8 //20% discount
    }
    else {
        return price * 0,9 //10% discount
    }
}