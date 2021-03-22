package maxlendiff

import kotlin.math.abs
import kotlin.math.max

fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {
    if (a1.isEmpty() or a2.isEmpty()) return -1
    var maxLengDiff = 0
    for (x in a1) {
        val y = a2.map{ abs(x.length - it.length) }.maxOrNull() ?: 0
        maxLengDiff = max(y, maxLengDiff)
    }
    return maxLengDiff
}



