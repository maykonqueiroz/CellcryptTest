package com.example.cellcryptfactorial

//Write a function f that outputs the sum of all digits of a factorial ranging from 0 to 2000 (in math terms - [0,2000] ). e.g. f(2) = 2, f(3) = 6, ...
//Requirements:
//code must be written in Kotlin
//we expect unit tests, if applicable
//coherent coding style
//execution under 1 minute (ideally under 2s)
//this test should not last longer than 6 hours
//use of math libraries not allowed
//Notes
//attention to details will be evaluated
//in addition to the code, we expect a written explanation on what steps have been taken to ensure a correct result is obtained after each execution.

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val start = System.currentTimeMillis()
        val n = 2000
        for (i in 1..n) {
            println("f($i) = " + Factorial().doSumOfDigitsOfFactorial(i))
        }
        println("Finished in ${(System.currentTimeMillis() - start)} ms")
    }
}