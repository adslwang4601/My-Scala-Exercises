/* Write a package random with functions nextInt(): Int, nextDouble(): Double,
and setSeed(seed: Int): Unit. To generate random numbers, use the linear
congruential generator*/
package random
package object random {
  val a = 1664525
  val b = 1013904223
  val n = 32
  var seed: BigInt = 0
  var randomNumber: BigInt = seed
  def nextInt():BigInt ={
    randomNumber = (randomNumber * a + b) % (BigInt(2).pow(n))
    randomNumber
  }
  def setSeed(newSeed: Int): Unit = {
    seed = newSeed
  }
}


