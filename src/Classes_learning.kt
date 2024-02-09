data class Cat (var weight: Float = 4.45f, val color: String = "Brown"){
    val type: String = "Cat"


    fun feed(weight: Float) {
        this.weight += weight
        print(weight)
    }

    override fun toString(): String {
        return "Cat(weight=$weight, color='$color', type='$type')"
    }
}