abstract class UnitConversion {
  def convert(value: Double): Double
}

object InchesToCentimeters extends UnitConversion {
  def convert(value: Double) = value * 2.54
}

object GallonsToliters extends UnitConversion {
  def convert(value: Double) = value * 3.785411784
}

object MilesToKilometers extends UnitConversion {
  def convert(value: Double) = value * 1.609344
}