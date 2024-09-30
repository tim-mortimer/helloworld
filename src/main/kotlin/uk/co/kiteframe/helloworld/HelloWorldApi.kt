package uk.co.kiteframe.helloworld

import org.http4k.core.*
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
        "/greet" bind Method.GET to getGreeting(helloWorld)
    )
}

private fun getGreeting(helloWorld: HelloWorld) = { _: Request -> Response(Status.OK).body(helloWorld.greet()) }