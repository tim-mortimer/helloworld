package uk.co.kiteframe.helloworld

import org.http4k.core.HttpHandler
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Status
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HelloWorldApiTest {
    @Test
    fun `greetings can be requested`() {
        val api: HttpHandler = api()
        val response = api(Request(Method.GET, "/greet"))
        assertEquals(Status.OK, response.status)
        assertEquals("Hello, world", response.bodyString())
    }
}