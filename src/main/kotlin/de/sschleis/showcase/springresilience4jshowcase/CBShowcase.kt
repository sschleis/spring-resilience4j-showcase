package de.sschleis.showcase.springresilience4jshowcase

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.springframework.stereotype.Component
import java.io.IOException
import java.lang.Exception

@Component
class CBShowcase {

    var counter = 0

    @CircuitBreaker(name = "cb1", fallbackMethod = "fallback")
    fun cbMethod(): String {
        counter++
        println("cbMethod call $counter")
        if (counter % 2 == 0)
            throw IOException("Exception")
        return "Done"
    }

    fun fallback(e: Exception): String? {
        return "Fallback ${e.message}"
    }

}