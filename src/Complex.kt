data class Complex(private var numerator: Double, private var denominator: Double) {
    init {

    }

    fun plus(secondFraction: Complex) {
        val a = numerator
        val b = denominator
        val c = secondFraction.numerator
        val d = secondFraction.denominator
        return Complex(a + c, b + d)
    }

    fun minus(secondFraction: Complex): Complex {

    }

    fun multiply(secondFraction: Complex): Complex {

    }

    fun divide(secondFraction: Complex): Complex {

    }
}



