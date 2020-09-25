//5
10 max 20

// 6
BigInt(2).pow(1024)

// 7
import scala.math.BigInt._
import scala.util.Random
probablePrime(100, Random)

// 8
val randomBigInt: BigInt = scala.math.BigInt.apply(20, Random)
val baseString: String = randomBigInt.toString(36)

// 9
val s = "Hello"
val firstChar = s(0)
val lastChar = s.takeRight(1)

// 10
//查询API即可 take是从字符串首开始获取字符串,drop是从字符串首开始去除字符串。 takeRight和dropRight是从字符串尾开始操作。 这四个方法都是单方向的。 如果我想要字符串中间的子字符串，那么需要同时调用drop和dropRight，或者使用substring

