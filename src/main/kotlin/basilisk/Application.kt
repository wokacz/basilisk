package basilisk

import basilisk.plugins.configureHTTP
import basilisk.plugins.configureRouting
import basilisk.plugins.configureSecurity
import basilisk.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSecurity()
    configureHTTP()
    configureSerialization()
//    configureDatabases()
    configureRouting()
}
