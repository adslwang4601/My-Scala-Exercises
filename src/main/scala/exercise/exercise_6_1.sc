object Conversions {
  def inchesToCentimeters(inches: Double) = inches / 0.39370

  def gallonsToliters(gallons: Double) = gallons * 3.785411784

  def milesToKilometers(miles: Double) = miles * 1.609344
}

println(Conversions.inchesToCentimeters(100))
