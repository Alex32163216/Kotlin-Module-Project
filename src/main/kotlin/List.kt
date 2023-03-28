class List : Team() {
    private var List: MutableMap<Int, Archive> = HashMap()
    private fun addArch() {
        println("Введите название архива:")
        val read = readLine()!!
        val archive = Archive(read, Notes())
        List[(List.size + 1)] = archive
    }
    override fun teams() {
        for (team in 1..List.size) {val string = List[team]?.name
            println("$team. $string")
        }
    }
    override fun printing() {
        while (true) {
            println("Список архивов")
            println("0. Создать архив")
            menuNumb = List.size + 1
            if (List.isNotEmpty()) teams()
            println("${menuNumb}. Выход")
            choice = teamsReader()
            when (choice) {0 -> addArch()
                menuNumb -> return
                else -> if (List.contains(choice)) List[choice]?.noteMenu?.printing()
                else println( "Ошибка! Пункта в меню с таким номером нет. Выберете порядковое число пункта меню")
            }
        }
    }
}