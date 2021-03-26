package solution

import kotlin.math.sqrt

object PrimeDecomp {
    fun factors(l: Int): String {
        return primeFactors(l)
            .groupingBy { it }
            .eachCount()
            .flatMap { (if (it.value == 1) "(${it.key})" else "(${it.key}**${it.value})").toList() }
            .joinToString("")

    }
}

// https://www.geeksforgeeks.org/prime-factor/
fun primeFactors(n: Int): List<Int> {
    val factors = mutableListOf<Int>()
    var m = n
    if (n > 0) {
        while (m > 0 && m % 2 == 0) {
            factors.add(2)
            m /= 2
        }
        for (i in 3..sqrt(m.toDouble()).toInt() step 2) {
            while (m % i == 0) {
                factors.add(i)
                m /= i
            }
        }
        if (m > 2) {
            factors.add(m)
        }
    }
    return factors
}

fun main(args: Array<String>) {
    val n = 7775460
    println(PrimeDecomp.factors(n))
}
