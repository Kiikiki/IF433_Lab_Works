package oop_110866_Kiara.week13.tugas
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv():String = "$id, $symbol, $margin, $pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")

        val id = parts[0].toInt()
        val symbol = parts[1]
        val price = parts[2].toDouble()
        val pnl = parts[3].toDouble()

        TradeRecord(id, symbol, price, pnl)
    }
    catch (e: Exception) {
        println("[log] corrupted data ignored: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path)
            .readLines()
            .mapNotNull { fromCsvTrade(it) }
    }
    catch (e: FileNotFoundException) {
        println("[log] File not found: $path")
        emptyList()
    }
}