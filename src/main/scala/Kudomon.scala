import scala.util.Random

abstract class Kudomon {
    val name: String
    val kudo_type: String
    var _pos: Option[(Int, Int)]
    var _hp : Int
    var _cp : Int
    
    def pos = _pos
    def pos_= (newPos: Option[(Int, Int)]) = _pos = newPos
    
    def hp = _hp
    def hp_= (newHp: Int) = _hp = newHp
    
    def cp = _cp
    def cp_= (newCp: Int) = _cp = newCp
}

class Chikapu extends Kudomon {
    val name = "Chikapu"
    val kudo_type = "Electric"
    var _pos = Option(null.asInstanceOf[(Int, Int)])
    var r = new scala.util.Random
    var _hp = r.nextInt(250)
    var _cp = r.nextInt(50) 
}

class Sourbulb extends Kudomon {
    val name = "Sourbulb"
    val kudo_type = "Grass"
    var _pos = Option(null.asInstanceOf[(Int, Int)])
    var r = new scala.util.Random
    var _hp = r.nextInt(250)
    var _cp = r.nextInt(50)
}

class Mancharred extends Kudomon {
    val name = "Mancharred"
    val kudo_type = "Fire"
    var _pos = Option(null.asInstanceOf[(Int, Int)])
    var r = new scala.util.Random
    var _hp = r.nextInt(250)
    var _cp = r.nextInt(50)
}

class Quirtles extends Kudomon {
    val name = "Quirtles"
    val kudo_type = "Water"
    var _pos = Option(null.asInstanceOf[(Int, Int)])
    var r = new scala.util.Random
    var _hp = r.nextInt(250)
    var _cp = r.nextInt(50)
}

class Geoman extends Kudomon {
    val name = "Geoman"
    val kudo_type = "Rock"
    var _pos = Option(null.asInstanceOf[(Int, Int)])
    var r = new scala.util.Random
    var _hp = r.nextInt(250)
    var _cp = r.nextInt(50)
}

class Flairy extends Kudomon {
    val name = "Flairy"
    val kudo_type = "Psychic"
    var _pos = Option(null.asInstanceOf[(Int, Int)])
    var r = new scala.util.Random
    var _hp = r.nextInt(250)
    var _cp = r.nextInt(50)
}