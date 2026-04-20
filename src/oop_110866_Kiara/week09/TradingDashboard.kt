package oop_110866_Kiara.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 15.5, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 20, -8.3, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 5, -3.2, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 15, 22.1, "CLOSED"),
        TradeLog("BNBUSDT", "LONG", 8, 5.0, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 12, -1.5, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0.0 }

    val losingTrades = closedTrades.filter { it.roe <= 0.0 }

    val topPerformanceString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (lev: ${it.leverage}x)" }

    val worstPerformanceString = winningTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: -${it.roe} % ROE (lev: ${it.leverage}x)" }


}