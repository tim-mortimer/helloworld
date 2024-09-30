package uk.co.kiteframe.helloworld

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HelloWorldTest {
    @Test
    fun `it greets the world`() {
        val helloWorld = HelloWorld()

        assertEquals("Hello, world", helloWorld.greet())

        // or, with Kotest assertions
        helloWorld.greet() shouldBe "Hello, world"
    }
}