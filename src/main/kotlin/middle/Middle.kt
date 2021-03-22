package middle

fun getMiddle(word : String) : String {
    val l = word.length
    return if (l % 2 == 0) word.substring(l/2 - 1, l/2 + 1) else word.get(l/2).toString()
}
