interface Aircraft {
    fun fly()
}

class Boeing777 : Aircraft {
    override fun fly() {
        println("Fly Boeing777!")
    }
}

class Boeing737 : Aircraft {
    override fun fly() {
        println("Fly Boeing737!")
    }
}



class AircraftFactory: factory<Aircraft>() {
    override fun create(model: String): Aircraft? {
        return when (model) {
            "Boeing777" -> Boeing777()
            "Boeing737" -> Boeing737()

            else -> null
        }
    }
}