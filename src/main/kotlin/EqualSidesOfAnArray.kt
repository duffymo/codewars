object EqualSidesOfAnArray {
    fun findEvenIndex(arr: IntArray): Int {
        if ((arr.size == 1) or (arr.sum() == 0)) return 0
        for (n in 1..arr.size-2) {
            if (arr.sliceArray(0..n-1).sum() == arr.sliceArray(n+1..arr.size-1).sum()) return n
        }
        return -1
    }
}