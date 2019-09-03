package com.example.project

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class StringsTest {
    @Test
    fun `Should concatenate two strings`() {
        assertEquals("Hello" + "World", "HelloWorld")
    }

    @Test
    fun `Should interpolate the string`() {
        val string = "Hello"
        assertEquals("Say $string", "Say Hello")
    }

    @Test
    fun `Should interpolate the concatenation of the strings`() {
        val hello = "Hello"
        val world = "World"
        assertEquals("Say ${hello + world}", "Say HelloWorld")
    }

    @Test
    fun `Should compare the value of the strings`() {
        val hello = "Hello"
        val world = "World"
        assertFalse(hello == world)
        assertTrue(hello != world)
    }
}