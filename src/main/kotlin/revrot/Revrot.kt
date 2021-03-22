package revrot

import java.lang.Character.getNumericValue

fun revRot(nums:String, sz:Int): String {
    return nums
        .toCharArray()
        .toList()
        .windowed(sz, sz, false)
        .map { if (sumOfCubeOfDigits(it) % 2 == 0) it.reversed() else rotateLeft(it) }
        .map{ it.joinToString("") }
        .fold("") { s, it -> s + it }
}

fun sumOfCubeOfDigits(num: List<Char>): Int {
        return num
            .map { getNumericValue(it) }
            .map { cube(it) }
            .fold(0) { sum, x -> sum + x }
}

fun cube(x: Int): Int = x*x*x

fun rotateLeft(x: List<Char>): List<Char> {
    val first = x[0]
    val result = x.toMutableList()
    for (i in 1..x.size-1) {
        result[i-1] = result[i]
    }
    result[x.size-1] = first
    return result
}

fun main(args: Array<String>) {
    val s = "73304"
    println("s: $s")
    println("sum of cube of digits: ${sumOfCubeOfDigits(s.toList())}")
    println("rotateLeft(s): ${rotateLeft(s.toList())}")
}


