package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testAddPositiveNumbers() {
        // Test adding two positive numbers
        int result = Main.add(5, 10);
        assertEquals(15, result, "5 + 10 should equal 15");
    }

    @Test
    void testAddNegativeNumbers() {
        // Test adding two negative numbers
        int result = Main.add(-5, -10);
        assertEquals(-15, result, "-5 + -10 should equal -15");
    }

    @Test
    void testAddMixedNumbers() {
        // Test adding positive and negative numbers
        int result = Main.add(10, -5);
        assertEquals(5, result, "10 + -5 should equal 5");
    }

    @Test
    void testAddZero() {
        // Test adding zero
        int result = Main.add(0, 0);
        assertEquals(0, result, "0 + 0 should equal 0");
    }
}

