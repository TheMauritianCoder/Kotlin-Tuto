open class Vampire(name : String) : Enemy(name, 30,3){
    // Note we have to add "open" to the method takeDamage in parent class. Just like protected
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}