package de.sschleis.showcase.springresilience4jshowcase

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
@RunWith(SpringRunner::class)
class RetryTest{

    @Autowired
    lateinit var retryShowcase: RetryShowcase

    @Test
    fun test(){
        retryShowcase.callMethod()
    }
}