class Trainer (name : String) {
    val trainer_name = name
    private var _kudo_collection : List[Kudomon] = List()
    private var _pos: (Int, Int) = (0,0)

    //Defining getter and setter for position
    def pos = this._pos
    def pos_= (newPos: (Int, Int)) = _pos = newPos
    
    //Defining getter and setter for kudo_collection
    def kudo_collection = this._kudo_collection
    def kudo_collection_= (newKudoCol: List[Kudomon]) = _kudo_collection = newKudoCol
    
    def move (dir : Char) = {
        dir match {
            case 'N' => {if (pos._2 + 1 < Game.size - 1){
                            this.pos = (pos._1, pos._2 + 1)
                         }else {
                            println("Invalid Move. You are at the edge.")
                         }
                        }
            case 'S' => {if (pos._2 - 1 > -1){
                            this.pos = (pos._1, pos._2 - 1)
                         }else {
                            println("Invalid Move. You are at the edge.")
                         }
                        }
            case 'E' => {if (pos._1 + 1 < Game.size - 1){
                            this.pos = (pos._1 + 1, pos._2)
                         }else {
                            println("Invalid Move. You are at the edge.")
                         }
                        }
            case 'W' => {if (pos._1 - 1 > -1){
                            this.pos = (pos._1 - 1, pos._2)
                         }else {
                            println("Invalid Move. You are at the edge.")
                         }
                        }
            case _   => println("Invalid move. Please enter a valid direction.")
        }
        Game.kudo_check(this)
    }
    
    def insert_kudo(k : Kudomon) = {
        this.kudo_collection = k :: this.kudo_collection
    }
}