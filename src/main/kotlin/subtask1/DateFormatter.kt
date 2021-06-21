package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
       val date: LocalDate
       return try {
           val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
           val formatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("Ru"))
           date.format(formatter)
       } catch (error: DateTimeException) {
           "Такого дня не существует"
       }
    }
}
