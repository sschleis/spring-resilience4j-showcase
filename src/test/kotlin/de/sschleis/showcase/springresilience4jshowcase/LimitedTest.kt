package de.sschleis.showcase.springresilience4jshowcase

import de.sschleis.showcase.springresilience4jshowcase.RatelimiterShowcase
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
@RunWith(SpringRunner::class)
class LimitedTest{

    @Autowired
    lateinit var limited: RatelimiterShowcase

    @Test
    fun callLimited(){
        for(i in 1..20) {
            println("Call $i")
            limited.limitedMethod()
            Thread.sleep(10L)
        }
    }
}

