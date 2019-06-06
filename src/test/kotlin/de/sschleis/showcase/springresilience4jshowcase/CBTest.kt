package de.sschleis.showcase.springresilience4jshowcase

import de.sschleis.showcase.springresilience4jshowcase.CBShowcase
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
@RunWith(SpringRunner::class)
class CBTest{

    @Autowired
    lateinit var cbShowcase: CBShowcase

    @Test
    fun test(){
        println(cbShowcase.cbMethod())
        println(cbShowcase.cbMethod())
        println(cbShowcase.cbMethod())
        println(cbShowcase.cbMethod())
        println(cbShowcase.cbMethod())
        println(cbShowcase.cbMethod())
        println(cbShowcase.cbMethod())
        println(cbShowcase.cbMethod())
        println(cbShowcase.cbMethod())
    }
}