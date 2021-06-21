package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when (blockB) {
            String::class -> {
                blockA.filterIsInstance<String>().joinToString("")
            }
            Int::class -> {
                blockA.filterIsInstance<Int>().sum()
            }
            LocalDate::class -> {
                val date = blockA.filterIsInstance<LocalDate>().max()
                val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                if (date != null){
                    return date.format(formatter)
                }else{
                    return ""
                }
            }
            else -> ""
        }
    }
}
