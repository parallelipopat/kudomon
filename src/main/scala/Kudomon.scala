abstract class Kudomon {
    val name: String
    val kudo_type: String
    var _pos: Option[(Int, Int)]
    
    def pos = _pos
    def pos_= (newPos: Option[(Int, Int)]) = _pos = newPos
}

class Chikapu extends Kudomon {
    val name = "Chikapu"
    val kudo_type = "Electric"
    var _pos = Option(null.asInstanceOf[(Int, Int)])
}

class Sourbulb extends Kudomon {
    val name = "Sourbulb"
    val kudo_type = "Grass"
    var _pos = Option(null.asInstanceOf[(Int, Int)])
}

class Mancharred extends Kudomon {
    val name = "Mancharred"
    val kudo_type = "Fire"
    var _pos = Option(null.asInstanceOf[(Int, Int)])
}

class Quirtles extends Kudomon {
    val name = "Quirtles"
    val kudo_type = "Water"
    var _pos = Option(null.asInstanceOf[(Int, Int)])
}

class Geoman extends Kudomon {
    val name = "Geoman"
    val kudo_type = "Rock"
    var _pos = Option(null.asInstanceOf[(Int, Int)])
}

class Flairy extends Kudomon {
    val name = "Flairy"
    val kudo_type = "Psychic"
    var _pos = Option(null.asInstanceOf[(Int, Int)])
} 