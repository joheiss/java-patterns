package com.jovisco.tutorial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AppTest {

    @Nested
    @DisplayName("General App Tests")
    class GeneralAppTests {
        @Test
        void shouldAnswerWithTrue() {
            assertTrue( true );
        }
    }
}