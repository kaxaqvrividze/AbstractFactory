

class AbstractFactory private constructor() {


    companion object{
        private var _carFactory: factory<Car>? = null
        private var _aircraftFactory: factory<Aircraft>? = null


        fun getCarFactory(): factory<Car>?{
            if(_carFactory == null)
                _carFactory = CarFactory()

            return _carFactory
        }

        fun getAircraftFactory(): factory<Aircraft>?{
            if(_aircraftFactory == null)
                _aircraftFactory = AircraftFactory()

            return _aircraftFactory
        }
    }
}