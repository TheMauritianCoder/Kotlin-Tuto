class VampireKing(name : String) : Vampire(name) {

    // Executed at the Time we create the instance.
    init {
        hitPoints = 140
    }

    // This is equal to damage / 4 , because the super method is already diving by 4
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

}