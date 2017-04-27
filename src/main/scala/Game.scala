object Game {
    var size : Int = 10
    var grid = Array.ofDim[Option[Kudomon]](size,size)

    //Initialise the grid
    def fill_grid(listkudo : List[Kudomon])= {
        for (i <- 0 until size; j <- 0 until size){
            grid(i)(j) = None
        }
        //Populate the grid with Kudomon
        for (i <- listkudo) {
            i.pos match {
                case Some(x) => grid(x._1)(x._2) = Some(i)
                case None => {}
            }
        }      
    }

    def kudo_check(a : Trainer) = {
        var kudo_at_pos = grid(a.pos._1)(a.pos._2)
        kudo_at_pos match {
            //Kudomon can be caught; remove Kudomon from grid once caught
            case Some(x) => a.insert_kudo(x); grid(a.pos._1)(a.pos._2) = None
            case None => {}
        }
    }
}
