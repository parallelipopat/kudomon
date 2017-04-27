import org.scalatest._

class Part1Test extends FunSuite {
  test("Chikapu") {
    assertCompiles("var x = new Chikapu")
  }
  test("Sourbulb") {
    assertCompiles("var x = new Sourbulb")
  }
  test("Mancharred") {
    assertCompiles("var x = new Mancharred")
  }
  test("Quirtles") {
    assertCompiles("var x = new Quirtles")
  }
  test("Geoman") {
    assertCompiles("var x = new Geoman")
  }
  test("Flairy") {
    assertCompiles("var x = new Flairy")
  }
  test("Trainer") {
    var name = "abc"
    assertCompiles("var x = new Trainer(name)")
  }
}