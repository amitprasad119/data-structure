import org.scalatest.funsuite.AnyFunSuite

class CubeCalculatorTest extends AnyFunSuite {

  test("Calculate the cube for positive integer") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("Throw exception if cube number is negative") {
    assertThrows[Exception] {
      CubeCalculator.cube(-1)
    }
  }
}
