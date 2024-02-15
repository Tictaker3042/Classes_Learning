import kotlin.math.pow

data class Complex(private var real: Double, private var imaginary: Double) {
    init {

    }

    operator fun plus(other: Complex): Complex {
        val newReal = this.real + other.real
        val imaginary = this.imaginary + other.imaginary
        return Complex(newReal, imaginary)
    }

    operator fun minus(other: Complex): Complex {
        val newReal = this.real - other.real
        val newImaginary = this.imaginary - other.imaginary
        return Complex(newReal, newImaginary)
    }

    operator fun times(other: Complex): Complex {
        val newReal = this.real * other.real - this.imaginary * other.imaginary
        val newImaginary = other.real * this.imaginary + this.real * other.imaginary
        return Complex(newReal, newImaginary)
    }

    operator fun div(other: Complex): Complex {
        val newReal = -((this.real*other.real + this.imaginary*other.imaginary)/(other.real.pow(2) + other.imaginary.pow(2)))
        val newImaginary = ((other.real*this.imaginary - this.real*other.imaginary)/(other.real.pow(2) + other.imaginary.pow(2)))
        return Complex(newReal, newImaginary)
    }

    override fun toString(): String {     /*переопределяет строковое представление об объекте*/
        return "$real + $imaginary"
    }
}

fun main() {
    val first = Complex(1.0, 3.0)
    val second = Complex(1.0, 4.0)
    println("a = $first")
    println("b = $second")
    println("a + b = ${first + second}")
    println("a - b = ${first - second}")
    println("a * b = ${first * second}")
    println("a / b = ${first / second}")
}

