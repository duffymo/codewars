import kotlin.streams.toList

fun duplicateCount(text: String): Int {
    return text.toLowerCase()
        .chars()
        .toList()
        .groupingBy { it }
        .eachCount()
        .filter { it.value > 1 }
        .size
}