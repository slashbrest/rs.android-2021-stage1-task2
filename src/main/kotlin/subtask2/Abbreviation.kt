package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val setStringUpp = a.toUpperCase()
        var getStringUpp = ""
        for (i in setStringUpp){
            if (b.contains(i))
                getStringUpp += i
        }
        return if (getStringUpp == b)
            "YES"
        else
            "NO"
    }
}
