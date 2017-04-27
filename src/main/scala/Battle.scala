import scala.util.Random

object Battle{

    var strengths = Map("Water" -> List("Fire"),
                        "Fire" -> List("Grass"),
                        "Grass" -> List("Rock"),
                        "Rock" -> List("Electric"),
                        "Electric" -> List("Water"),
                        "Psychic" -> List("Water", "Fire", "Grass", "Rock", "Electric"))

    def battle(k1 : Kudomon, k2: Kudomon) : Kudomon = {
        var r1 = new scala.util.Random
        var first : Kudomon = null.asInstanceOf[Kudomon]
        var second : Kudomon = null.asInstanceOf[Kudomon]
        var winner: Kudomon = null.asInstanceOf[Kudomon]
        //Choose which Kudomon starts
        if (r1.nextInt(2) == 1) {
            first = k2; second = k1;
        }
        else {
            first = k1; second = k2;
        }
        
        while (first.hp > 0 && second.hp > 0) {
            attack(first, second)
            //Check if the second kudomon has fainted
            if (second.hp <= 0) {
                winner = first
            }
            // Otherwise continue battle
            else {
                attack(second, first)
                //Check if the first kudomon has fainted
                if (first.hp <= 0) {
                    winner = second
                }
            }            
        }
        winner
    }
    
    def attack(k1: Kudomon, k2: Kudomon) = {
        if (strengths(k1.kudo_type).contains(k2.kudo_type)) {
            k2.hp = k2.hp - 2*k1.cp
            println(k1.name + " hit with " + 2*k1.cp + " points.")
        }
        else {
            k2.hp = k2.hp - k1.cp
            println(k1.name + " hit with " + k1.cp + " points.")
        }
        println(k2.name + " has " + k2.hp + " points left.")
    }
}