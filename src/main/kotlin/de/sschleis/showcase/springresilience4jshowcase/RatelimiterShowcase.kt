package de.sschleis.showcase.springresilience4jshowcase

import io.github.resilience4j.ratelimiter.annotation.RateLimiter
import org.springframework.stereotype.Component

@Component
class RatelimiterShowcase {

    @RateLimiter(name = "limit1", fallbackMethod = "fallback")
    fun limitedMethod() {
        println("Limitied Method Executed!")
    }

    @Suppress("unused")
    fun fallback(e: Exception) {
        println("Fallback! ${e.message}")
    }
}