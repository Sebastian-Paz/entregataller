fun main() {
    val winningBid = Bid(5000, "Private Collector")
    println("Item A is sold at ${getAuctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${getAuctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun getAuctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return if (bid != null) bid.amount else minimumPrice
}
