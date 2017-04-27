import org.scalatest._

class Part4Test extends FunSuite {
  
  test("Normal Battle") {
    var a = new Chikapu
    //Overriding hp and cp for test.
    a.hp = 100
    a.cp = 10
    
    var b = new Mancharred
    //Overriding hp and cp for test.
    b.hp = 50
    b.cp = 1

    assert(Battle.battle(a,b) == a)
  }
  
  test("Strength Battle") {
    var a = new Chikapu
    //Overriding hp and cp for test.
    a.hp = 100
    a.cp = 10
    
    var b = new Quirtles
    //Overriding hp and cp for test.
    b.hp = 200
    b.cp = 6

    assert(Battle.battle(a,b) == a)
  }
  
  test("Strength Battle 2") {
    var a = new Flairy
    //Overriding hp and cp for test.
    a.hp = 100
    a.cp = 10
    
    var b = new Quirtles
    //Overriding hp and cp for test.
    b.hp = 200
    b.cp = 6

    assert(Battle.battle(a,b) == a)
  }
  
  test("Strength Battle 3") {
    var a = new Flairy
    //Overriding hp and cp for test.
    a.hp = 100
    a.cp = 10
    
    var b = new Flairy
    //Overriding hp and cp for test.
    b.hp = 200
    b.cp = 6

    assert(Battle.battle(a,b) == b)
  }
}