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
            /*We solve the problem by making the Kudomon 'invisible' to the trainer
              who has already caught it. So while the Kudomon is still present on
              the map for other trainers, it isn't for the trainer who has caught it.
              I was considering a concurrent solution where each block has a
              boolean semaphore attached to it that prevents more than one
              trainer having access to that block at any point in time, but that
              is not scalable, and quite restrictive. */
              
            case Some(x) => {if (!a.kudo_collection.contains(x)) {
                                 a.insert_kudo(x);
                             }
                            }
            case None => {}
        }
    }
}
