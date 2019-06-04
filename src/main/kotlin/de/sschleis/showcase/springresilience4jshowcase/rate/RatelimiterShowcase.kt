package de.sschleis.showcase.springresilience4jshowcase.rate

import io.github.resilience4j.ratelimiter.annotation.RateLimiter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class RatelimiterShowcase

fun main(args: Array<String>) {
    runApplication<RatelimiterShowcase>(*args)
}

@Component
class Limited{

    @RateLimiter(name = "limit1", fallbackMethod = "fallback")
    fun limitedMethod(){
        println("Limitied Method Executed!")
    }

    fun fallback(e: Exception){
        println("Fallback! ${e.message}")
    }
}