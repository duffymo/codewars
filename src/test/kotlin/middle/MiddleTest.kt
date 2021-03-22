package middle

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MiddleTest {

    @Test
    fun basicTest() {
        assertEquals("es", getMiddle("test"));
        assertEquals("dd", getMiddle("middle"));
        assertEquals("t", getMiddle("testing"));
        assertEquals("A", getMiddle("A"));
    }
}
