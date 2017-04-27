import org.scalatest._

class Part3Test extends FunSuite {
  
  test("Catching Kudomon 2") {
    var a = new Chikapu
    a.pos = Some((1,1))
    Game.fill_grid(List(a))
    
    var b = new Trainer("B")
    var c = new Trainer("C")
    
    b.move('N')
    c.move('N')
    b.move('E')
    c.move('E')
    assert(b.kudo_collection == List(a))
    //Check that c can catch it
    assert(c.kudo_collection == List(a))    
    b.move('W')
    b.move('E')
    //Checking that kudomon is not re-added
    assert(b.kudo_collection == List(a))
  }
}