fun wave(str: String): List<String> {
    var result = mutableListOf<String>()
    if (str.isNotBlank()) {
        for (i in 0..str.length-1) {
            if (str[i] != ' ') {
                result.add(upperCaseCharAt(str, i))
            }
        }
    }
    return result
}

fun upperCaseCharAt(s: String, i: Int): String {
    val builder = StringBuilder(s.toLowerCase())
    builder.setCharAt(i, s[i].toUpperCase())
    return builder.toString()
}

fun main() {
    val s = "This is a few words"
    println(wave(s))
}
