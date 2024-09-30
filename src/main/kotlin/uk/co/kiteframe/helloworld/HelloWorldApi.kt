package uk.co.kiteframe.helloworld

import org.http4k.core.HttpHandler
import org.http4k.core.Method
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.routing.bind
import org.http4k.routing.routes
import org.http4k.server.Undertow
import org.http4k.server.asServer

fun main() {
    api().asServer(Undertow(8001)).start()
}

fun api(): HttpHandler {
    val helloWorld = HelloWorld()
    return routes(
        "/greet" bind Method.GET to { Response(Status.OK).body(helloWorld.greet()) }
    )
}