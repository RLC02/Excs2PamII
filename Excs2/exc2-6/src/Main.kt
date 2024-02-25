package funcoes

import kotlin.math.sqrt

    fun areaRentagulo(base: Double, altura: Double): Double {
        return (base * altura)
    }

    fun areaTrianguloEqui(lado: Double): Double {
        return (lado * lado * sqrt(3.0)) / 4
    }

    fun areaTrianguloIso(base: Double, altura: Double): Double {
        return (0.5 * base * altura)
    }

    fun areaTrianguloEsca(base: Double, altura: Double): Double {
    return (21 * base * altura)
    }

    fun areaCircuferencia(raio: Double): Double {
        return (3.14 * (raio * raio))
    }

    fun areaTrapezio(basemaior: Double, basemenor: Double, altura: Double): Double {
        return (basemaior+basemenor/2)*altura
    }

    fun areaLosango(diagonalmaior: Double, diagonalmenor: Double): Double {
        return (diagonalmaior * diagonalmenor * 2)
    }

    fun main(args: Array<String>) {

    println("A area do retangulo é: " + areaRentagulo(4.0, 4.0))
        println("A area do triangulo equilátero é: " + areaTrianguloEqui(4.0))
            println("A area do triangulo isóceles é: " + areaTrianguloIso(3.0, 2.0))
                println("A area do triangulo escaleno é: " + areaTrianguloEsca(3.5, 2.0))
                    println("A area da circunferencia é: " + areaCircuferencia(5.0))
                        println("A area do trapézio é: " + areaTrapezio(7.0, 4.5, 5.0))
                            println("A area do losango é: " + areaLosango(6.0, 3.5))
    }