fun main() {
    AbstractFactory.getCarFactory()?.create("Maserati")?.drive()
    AbstractFactory.getAircraftFactory()?.create("Boeing737")?.fly()
}