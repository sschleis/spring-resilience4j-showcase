package de.sschleis.showcase.springresilience4jshowcase

import io.github.resilience4j.retry.annotation.Retry
import org.springframework.stereotype.Component
import java.io.IOException
import java.lang.Exception


@Component
class RetryShowcase(val dummy: Dummy) {

    fun callMethod(){
        println(dummy.doSomething())
    }
}

@Component
class Dummy{

    var counter = 0

    @Retry(name = "retry1", fallbackMethod = "fallback")
    fun doSomething(): String{
        counter++
        println("DoSomething call $counter")
        if(counter < 2)
            throw IOException("Exception")
        return "Done"
    }

    fun fallback(e: Exception): String? {
        return e.message
    }
}
