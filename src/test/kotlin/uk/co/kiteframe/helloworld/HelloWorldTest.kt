package uk.co.kiteframe.helloworld

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HelloWorldTest {
    @Test
    fun `with no one known, greetings are anonymous`() {
        val helloWorld = HelloWorld()
        assertEquals("Hello there", helloWorld.greet())
    }
}