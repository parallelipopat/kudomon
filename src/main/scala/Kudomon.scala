abstract class Kudomon {
    val kudo_type: String
    var pos: Option[(Int, Int)]
}

class Chikapu extends Kudomon {
    val kudo_type = "Electric"
    var pos = Option(null.asInstanceOf[(Int, Int)])
}

class Sourbulb extends Kudomon {
    val kudo_type = "Grass"
    var pos = Option(null.asInstanceOf[(Int, Int)])
}

class Mancharred extends Kudomon {
    val kudo_type = "Fire"
    var pos = Option(null.asInstanceOf[(Int, Int)])
}

class Quirtles extends Kudomon {
    val kudo_type = "Water"
    var pos = Option(null.asInstanceOf[(Int, Int)])
}

class Geoman extends Kudomon {
    val kudo_type = "Rock"
    var pos = Option(null.asInstanceOf[(Int, Int)])
}

class Flairy extends Kudomon {
    val kudo_type = "Psychic"
    var pos = Option(null.asInstanceOf[(Int, Int)])
}