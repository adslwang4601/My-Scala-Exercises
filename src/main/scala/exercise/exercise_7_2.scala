package com {
  class T1() {}

  package horstmann {
    class T2(t: T1) {}

    package impatient {
      class T3(t1: T1, t2: T2) {}
    }
  }
}


