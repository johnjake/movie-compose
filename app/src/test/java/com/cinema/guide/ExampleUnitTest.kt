package com.cinema.guide

import org.junit.Assert.*
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        fizzBuzz(888)
    }

    fun fizzBuzz(n: Int) {
        // Write your code here
        if (n % 3 == 0 && n % 5 == 0) {
            println("FizzBuzz")
        } else if (n % 3 == 0 && n % 5 != 0) {
            println("Fizz")
        } else if (n % 5 == 0 && n % 3 != 0) {
            println("Buzz")
        } else if (n % 3 != 0 && n % 5 != 0) {
            println("$n")
        } else {
            print("none")
        }
    }
}
