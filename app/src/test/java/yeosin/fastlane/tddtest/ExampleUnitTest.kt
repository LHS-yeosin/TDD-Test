package yeosin.fastlane.tddtest

import org.junit.Assert.*
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun nullCheck() {
        val o: Any? = null
        assertNull(o)
    }

    @Test
    fun notNullCheck() {
        val o: Any? = ""
        assertNotNull(o)
    }
}