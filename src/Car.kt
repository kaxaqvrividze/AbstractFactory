interface Car {
    fun drive();
}

class Maserati : Car {
    override fun drive() {
        println("Drive Maserati!")
    }
}

class Audi : Car {
    override fun drive() {
        println("Drive Audi!")
    }
}


class CarFactory: factory<Car>() {
    override fun create(model: String): Car? {
        return when (model) {
            "Audi" -> Audi()
            "Maserati" -> Maserati()
            else -> null
        }
    }
}