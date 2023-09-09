object MainApp {
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

  def main(args: Array[String]): Unit = {
    // Create instances of vehicles
    val car = Vehicle("Car", 65.0)
    val bicycle = Vehicle("Bicycle", 20.0)
    val motorcycle = Vehicle("Motorcycle", 120.0)

    // Create a SpeedComparator instance
    val comparator = new SpeedComparator()

    // Compare the speeds of vehicles
    val fastestVehicle1 = comparator.findFastest(car, bicycle)
    val fastestVehicle2 = comparator.findFastest(fastestVehicle1, motorcycle)

    // Print the results
    println(s"The fastest vehicle is ${fastestVehicle2.name} with a speed of ${fastestVehicle2.speedMPH} MPH")
  }
}
