import org.scalatest._

class Part2Test extends FunSuite {
  test("MoveN") {
    Game.fill_grid(List())
    var a = new Trainer("A")
    a.move('N')
    assert(a.pos == (0,1))
  }

  test("MoveS") {
    Game.fill_grid(List())
    var a = new Trainer("A")
    a.move('N')
    a.move('S')
    assert(a.pos == (0,0))
  }
  
  test("MoveBoundaryS") {
    Game.fill_grid(List())
    var a = new Trainer("A")
    a.move('S')
    assert(a.pos == (0,0))
  }
  
  test("MoveE") {
    Game.fill_grid(List())
    var a = new Trainer("A")
    a.move('E')
    assert(a.pos == (1,0))
  }
  
  test("MoveW") {
    Game.fill_grid(List())
    var a = new Trainer("A")
    a.move('E')
    a.move('W')
    assert(a.pos == (0,0))
  }

  test("MoveBoundaryW") {
    Game.fill_grid(List())
    var a = new Trainer("A")
    a.move('W')
    assert(a.pos == (0,0))
  }  
  
  test("MoveInvalid") {
    Game.fill_grid(List())
    var a = new Trainer("A")
    a.move('Z')
    assert(a.pos == (0,0))
  }
  
  test("Catching Kudomon") {
    var a = new Chikapu
    a.pos = Some((1,1))
    Game.fill_grid(List(a))
    
    var b = new Trainer("B")
    b.move('N')
    assert(b.kudo_collection == List())
    b.move('E')
    assert(b.kudo_collection == List(a))
    b.move('W')
    b.move('E')
    //Checking that kudomon is not re-added
    assert(b.kudo_collection == List(a))
  }
}