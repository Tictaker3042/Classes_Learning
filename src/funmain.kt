fun main() {
    val cat1 = Cat()
    val cat2 = Cat()
    val cat3 = cat1
    println(cat1.weight)
    println(cat1.color)
    println(cat1 == cat2)
    println(cat1 == cat3)
    println(cat1.toString())
    println(cat2.toString())
    println(cat3.toString())
}

