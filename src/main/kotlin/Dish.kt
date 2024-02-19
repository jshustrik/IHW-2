class Dish (
    val dishID: Int,
    var name: String,
    var count: Int, // пока непонятно, зачем
    var price: Int,
    var time: Int, // пока в минутах
) {
    fun getInfo() : String {
        return "$dishID $name $count $price $time"
    }
}

/*
class MovieSession (
    val sessionID: Int,
    var title: String,
    var director: String,
    private val strDate: String,
    var duration: Int,
    var ticketCost: Int,
    val seats: Array<Seat>
) {
    fun getDate() : LocalDateTime {
        return LocalDateTime.parse(strDate.replace('T', ' '), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))
    }

    fun parseDate() : LocalDateTime {
        return LocalDateTime.parse(strDate.replace('T', ' '), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
    }

    fun getInfo() : String {
        return "$sessionID $title $director ${getDate()} $duration $ticketCost ${seats.count()}"
    }

    fun getSeatsInfo() : Array<String> {
        val seatsInf: Array<String> = Array(seats.size) { "" }
        for (i in seatsInf.indices) {
            seatsInf[i] = seats[i].toString()
        }
        return seatsInf
    }
}
 */