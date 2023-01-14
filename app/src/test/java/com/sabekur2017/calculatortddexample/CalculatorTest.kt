package com.sabekur2017.calculatortddexample


import com.google.common.truth.Truth.assertThat

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class CalculatorTest {
    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun sum() {
        val x = 3.0
        val y= 2.0
        val result = calculator.sum(x,y)
        assertThat(result).isEqualTo(result)
    }

    @Test
    fun subtract() {
        val x = 3.0
        val y= 2.0
        val result = calculator.subtract(x,y)
        assertThat(result).isEqualTo(result)
    }

    @Test
    fun multiply() {
        val x = 3.0
        val y= 2.0
        val result = calculator.multiply(x,y)
        assertThat(result).isEqualTo(result)
    }

    @Test
    fun divide() {
        val x = 3.0
        val y= 2.0
        val result = calculator.divide(x,y)
        assertThat(result).isEqualTo(result)
    }
}