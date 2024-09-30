package uk.co.kiteframe.helloworld

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HelloWorldTest {
    @Test
    fun `it greets the world`() {
        val helloWorld = HelloWorld()
        assertEquals("Hello, world", helloWorld.greet())
    }
}