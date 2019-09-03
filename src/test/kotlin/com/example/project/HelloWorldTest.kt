package com.example.project

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HelloWorldTest {

    @Test
    fun `Should return Hello World string`() {
        val helloWorld = HelloWorld()
        assertEquals(helloWorld.printHello(), "Hello World!")
    }
}
