
package com.horstmann {
  object Horst {
    val name: String = "horstmann"
  }
}

package com {
  package horstmann {
    package impatient {
      class EmployeeA(val name: String) {
        println(Horst.name) //Horst is accessible
      }
    }
  }
}


