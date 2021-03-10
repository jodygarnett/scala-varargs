package com.github.jnh5y

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class VarArgsTest extends Specification {
  sequential

  "VarArgs" should {
    "work with objects" in {
      val objects = Array[AnyRef]("foo", new Integer(1))

      // Prints:
      // Called arrayFunction with 2 inputs.
      //  Object 0:foo
      //  Object 1:1
      MyJavaClass.function(objects)

      // Prints:
      // Called varargsFunction with 1 inputs.
      //  Object 0:[Ljava.lang.Object;@6b12d449
      MyJavaClass.function(objects)

      ok
    }

    "work with Integers" in {
      val integers = Array[Integer](new Integer(1), new Integer(5))

      // Both print:
      // Called arrayFunctionInteger with 2 inputs.
      //  Object 0:1
      //  Object 1:5

      MyJavaClass.function(integers)

      // Note that
      // MyJavaClass.varargsFunctionInteger(integers)
      // will not compile!
      // This means that the change from Integer[] -> Integer... will surface as a compiler error.
      // MyJavaClass.function(integers: _*)

      ok
    }
  }
}
