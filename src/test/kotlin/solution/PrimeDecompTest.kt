package solution

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class  PrimeDecompTest {

    private fun testing(n: Int, exp: String) {
        val ans = PrimeDecomp.factors(n)
        assertEquals(exp, ans)
    }

    @Test
    fun fixedTests() {
        testing(1024, "(2**10)")
        testing(7775460, "(2**2)(3**3)(5)(7)(11**2)(17)")

    }
}
