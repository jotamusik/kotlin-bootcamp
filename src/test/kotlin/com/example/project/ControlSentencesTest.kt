package com.example.project

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ControlSentencesTest {

    @Test
    fun `Should pass if number is between 1 and 5`() {
        val number = 3
        if (number in 1..5) assertTrue(true)
        else assertTrue(false)
    }

    @Test
    fun `Should pass if number is not 2`() {
        val number = 1
        when (number) {
            2 -> assertTrue(false)
            else -> assertTrue(true)
        }
    }

    @Test
    fun `Should have a 1 on position 2 of the array`() {
        val numbers = arrayOf(0, 1, 1, 2)
        var founded = false;
        for ((index, element) in numbers.withIndex()) {
            if ( index == 2 && element == 1) founded = true
        }
        assertTrue(founded)
    }

    @Test
    fun `Should iterate over alphabet range`() {
        var string: String = ""
        for (i in 'b'..'g') {
            string += i
        }
        assertEquals(string, "bcdefg")
    }

    @Test
    fun `Should iterate over number range`() {
        var string = ""
        for (i in 1..5) {
            string += i.toString()
        }
        assertEquals(string, "12345")
    }

    @Test
    fun `Should iterate over number downwards range`() {
        var string = ""
        for (i in 5 downTo 1) {
            string += i.toString()
        }
        assertEquals(string, "54321")
    }

    @Test
    fun `Should iterate over number range advancing in steps`() {
        var string = ""
        for (i in 0..10 step 2) {
            string += i.toString()
        }
        assertEquals(string, "0246810")
    }
}
