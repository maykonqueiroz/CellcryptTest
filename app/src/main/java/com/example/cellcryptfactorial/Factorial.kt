package com.example.cellcryptfactorial

class Factorial {
    private lateinit var number: ArrayList<Int>

        private fun multiply(x: Int) {
            var carry = 0                           // used to store the surplus value of the multiply
            val size = number.size
            for (i in 0 until size) {
                val result = carry + number[i] * x
                number[i] = result % 10             // set the result of the multiplication discounting the carry
                carry = result / 10                 // carry will be setted if the result greater than 10, just like a regular multiplication
            }
            while (carry != 0) {
                number.add(carry % 10)              // if there is a carry > 0 then a new digit must be added to our number
                carry /= 10                         // if carry greater than 10 then repeat the process by adding a new digit. If carry
            }
        }

        fun doSumOfDigitsOfFactorial(value: Int): Int {
            number = ArrayList()                    // Since a Long cannot store values ​​over 21!, we need to store every digit of the number in a Array.
            number.add(1)                           // Starting with 1 since 0! = 1 and 1! = 1
            for (i in 1..value) {
                multiply(i)
            }
            var sum = 0
            val size = number.size
            for (i in 0 until size) {
                sum += number[i]                    // iterates over the array, digit by digit and adding to the sum result
            }
            return sum
        }
}