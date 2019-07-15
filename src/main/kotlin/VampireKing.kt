import java.util.*

class VampireKing(name : String) : Vampire(name) {

    // Executed at the Time we create the instance.
    init {
        hitPoints = 140
    }

    // This is equal to damage / 4 , because the super method is already diving by 4
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

    fun runAway() : Boolean{
        return lives < 2
    }

    fun dodges():Boolean{
        val rando = Random()
        val chance = rando.nextInt(6)
        if(chance > 3){
            println("Dracula dodged")
            return true
        }
        return false
    }
}