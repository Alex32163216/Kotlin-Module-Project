abstract class Team {
    var menuNumb: Int = 0
    var choice: Int = 0
    var noteText: MutableMap<Int, Note> = HashMap()
    abstract fun teams()
    fun teamsReader(): Int {
        val comChoice: Int
        while (true) {val reader = readLine()
            if (reader != null) {if (reader.toIntOrNull() != null) {comChoice = reader.toInt()
                return comChoice } else println("Ошибка! Вы ввели символ. Нужно ввести порядковое число пункта меню")}
        }
    }
    abstract fun printing()
}
