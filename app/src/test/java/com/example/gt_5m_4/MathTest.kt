package com.example.gt_5m_4

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {
    var math: Math? = null

    @Before
    fun init() {
        math = Math()
    }

    @Test
    fun add() {
        assertEquals("5", math?.add("2", "3"))
    }

    @Test
    fun symbolTest() {
        assertEquals("Вы объязаны ввести числа", math?.add("xcvbghnjmkl", "3"))
    }

    @Test
    fun withPlusTest() {
        assertEquals("4", math?.add("+2", "2"))
    }

    @Test
    fun withEmptyTest() {
        assertEquals("Вы объязаны ввести числа", math?.add("2", ""))
    }

    @Test
    fun withNegativeTest() {
        assertEquals("-4", math?.add("-2", "-2"))
    }

    @Test
    fun withDoubleTest() {
        assertEquals("4.0", math?.add("2.0", " 2.0  "))
    }

    @Test
    fun withDoublePointTest() {
        assertEquals("Некорректный ввод", math?.add("2..0", "2.0"))
    }

    @Test
    fun divide() {
        assertEquals("4", math?.divide("8", "2"))
    }

    @Test
    fun symbolDivide() {
        assertEquals("Вы объязаны ввести числа", math?.divide("8", "2asdv"))
    }

    @Test
    fun zeroDivide() {
        assertEquals("На ноль делить нельзя", math?.divide("8", "0"))
    }

    @Test
    fun notNullDivide() {
        assertEquals("-2", math?.divide("-4", "2"))
    }

    @Test
    fun emptyDivide() {
        assertEquals("Вы объязаны ввести числа", math?.divide("", "2"))
    }

    @Test
    fun doubleDivide() {
        assertEquals("2.0", math?.divide("4.0", "2.0"))
    }


    @After
    fun detach() {
        math = null
    }
}