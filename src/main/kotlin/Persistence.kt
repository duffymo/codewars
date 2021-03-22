import java.lang.Character.getNumericValue
import java.util.Scanner

fun persistence(num: Int) : Int {
    var n = 0
    var x = num
    while (x >= 10) {
        x = x.toString().toCharArray().map{ getNumericValue(it) }.fold(1) { product, digit -> product*digit }
        ++n
    }
    return n
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    println("$num ${persistence(num)}")
}