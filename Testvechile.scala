import org.scalatest.funsuite.AnyFunSuite

class Testvechile extends AnyFunSuite {
  // Vehicle.scala

  case class Vehicle(name: String, speedMPH: Double)
  // SpeedComparator.scala

  class SpeedComparator {
    def findFastest(vehicle1: Vehicle, vehicle2: Vehicle): Vehicle = {
      if (vehicle1.speedMPH > vehicle2.speedMPH) {
        vehicle1
      } else {
        vehicle2

      }
    }
  }
  test("Vehicle class should correctly create instances") {
    val car = Vehicle("Car", 65.0)
    val bicycle = Vehicle("Bicycle", 20.0)

    assert(car.name == "Car")
    assert(car.speedMPH == 65.0)

    assert(bicycle.name == "Bicycle")
    assert(bicycle.speedMPH == 20.0)
  }

  test("SpeedComparator class should find the fastest vehicle") {
    val car = Vehicle("Car", 65.0)
    val bicycle = Vehicle("Bicycle", 20.0)
    val motorcycle = Vehicle("Motorcycle", 120.0)

    val comparator = new SpeedComparator()

    val fastest1 = comparator.findFastest(car, bicycle)
    val fastest2 = comparator.findFastest(fastest1, motorcycle)

    assert(fastest1 === car)
    assert(fastest2 === motorcycle)
  }
}


