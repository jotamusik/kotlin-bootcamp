package com.example.project

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ExpressionsTest {
    @Test
    fun `Should demonstrate the kotlin's expression power`() {
        val temperature = 10
        val isHot = if ( temperature > 50 ) true else false
        val message = "You are ${ if (isHot) "fried" else "safe" }"

        assertEquals(message, "You are safe")
    }
}