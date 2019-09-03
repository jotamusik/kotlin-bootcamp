package com.example.project

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertFails

class ArraysTest {

    @Test
    fun `Should make changes to an array - val only affects to the reference`() {
        val myList = mutableListOf("tuna", "salmon", "shark")
        myList.remove("shark")
        assertEquals(myList, mutableListOf("tuna", "salmon"))
    }

    @Test
    fun `Should create an array dynamicly`() {
        val myArray = Array(3) { index -> index * 2 }
        assertArrayEquals(myArray, arrayOf(0, 2, 4))
    }
}
