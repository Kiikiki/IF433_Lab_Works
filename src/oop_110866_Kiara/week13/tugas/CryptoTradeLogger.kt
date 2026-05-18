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

fun main() {
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", 500.0, 120.5),
        TradeRecord(2, "ETHUSDT", 300.0, -45.0),
        TradeRecord(3, "SOLUSDT", 150.0, 25.0)
    )

    val path = "crypto_trades.csv"
    saveTrades(trades, path)
    println("Trades successfully saved!")

    File(path).appendText("CORRUPT_ID, DOGEUSDT, Hold, XX, YY\n")
    println("Corrupted data injected")
    val loadedTrades = loadTrades(path)

    println("\nLoaded trades:")
    loadedTrades.forEach { println(it) }

    val totalPnl = loadedTrades.sumOf { it.pnl }

    println("\n=== Total pnl (clean) : $totalPnl===")
}

// Trades successfully saved!
// Corrupted data injected
// [log] corrupted data ignored: CORRUPT_ID, DOGEUSDT, Hold, XX, YY
//
// Loaded trades:
// TradeRecord(id=1, symbol= BTCUSDT, margin=500.0, pnl=120.5)
// TradeRecord(id=2, symbol= ETHUSDT, margin=300.0, pnl=-45.0)
// TradeRecord(id=3, symbol= SOLUSDT, margin=150.0, pnl=25.0)
//
// === Total pnl (clean) : 100.5 ===