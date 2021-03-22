fun encryptThis(text:String): String {
    return text.split("\\s+".toRegex())
        .map { s -> swapSecondAndLastChar(s) }
        .map { it.replaceFirst(it[0].toString(), it[0].toInt().toString()) }
        .joinToString(" ") { it }
}

fun swapSecondAndLastChar(s: String): String {
    if (s.length < 2) return s
    val builder = StringBuilder()
    val second = s[1]
    val last = s.last()
    for (i in s.indices) {
        when {
            i == 1 -> builder.append(last)
            i == s.length - 1 -> builder.append(second)
            else -> builder.append(s[i])
        }
    }
    return builder.toString()
}

fun main(args: Array<String>) {
    val tests = listOf("Hello", "good", "hello world", "abc")
    for (s in tests) {
        println("original: $s encrypted: ${encryptThis(s)} ")
    }
}
