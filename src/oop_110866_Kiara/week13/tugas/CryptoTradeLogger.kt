package oop_110866_Kiara.week13.tugas

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv():String = "$id, $symbol, $margin, $pnl"

