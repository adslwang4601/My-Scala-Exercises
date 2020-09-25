// 1
def calSignum(x: Int) = {
  if(x > 0) {
    1
  }
  else if(x==0) {
    0
  }
  else {
    -1
  }
}
val Signum=calSignum(x=(-10))

// 2
//No value, Unit
val t = {}

// 3
var x = {}
var y = 2
x = y = 1
print(x)

// 4
//for(i <- 0 to 10) println(10-i)
//for(i <- (0 to 10).reverse) println(i)
for(i <- 10 to 0 by -1) println(i)

// 5
def countdown(n: Int) = {
  for(i <- n to 0 by -1) println(i)
  }
countdown(5)

// 6, 8
def product(s: String): Long = {
  var p: Long = 1;
  for(ch <- s) p *= ch.toLong
  p
}
product("Hello")

// 7
def productNoLoop(s: String): Long = {
  s.map(_.toLong).product
}
product("Hello")

// 9
def productRecur(s: String): Long = {
  if (s.length == 0) 1: Long;
  else {
    s(0).toLong * productRecur(s.substring(1))
  }
}
val pR = productRecur("Hello")

// 10
def calN(n: Double, x: Int): Double = {
  if(n==0) 1
  else if(n>0) {
    if (n % 2 == 0) calN(n / 2, x) * calN(n / 2, x)
    else  x * calN(n - 1, x)
  }
  else{
    1/calN(-n, x)
  }
}

calN(2, 2)

// 11







