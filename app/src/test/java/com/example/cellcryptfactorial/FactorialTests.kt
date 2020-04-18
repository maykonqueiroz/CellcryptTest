package com.example.cellcryptfactorial

import org.junit.Test

import org.junit.Assert.*
class FactorialTests {

    @Test
    fun factorialSumOfZero() {
        assertEquals(1, Factorial().doSumOfDigitsOfFactorial(0))
    }

    @Test
    fun factorialSumOfOne() {
        assertEquals(1, Factorial().doSumOfDigitsOfFactorial(1))
    }

    @Test
    fun factorialSumOfTen() {
        assertEquals(27, Factorial().doSumOfDigitsOfFactorial(10))
    }

    @Test
    fun factorialSumOfTwoThousand() {
        assertEquals(23382, Factorial().doSumOfDigitsOfFactorial(2000))
    }
}
