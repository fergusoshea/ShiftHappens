package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class TranslatorTest {
    Translator translator = new Translator();

    @Test
    void testLetter1() {
        assertEquals("b", translator.translateString("a", 1));
    }

    @Test
    void testLetter2() {
        assertEquals("c", translator.translateString("a", 2));
    }

    @Test
    void testWord() {
        assertEquals("cde", translator.translateString("abc", 2));
    }

    @Test
    void testLetterOverflow() {
        assertEquals("b", translator.translateString("z", 2));
    }

    @Test
    void testCapital() {
        assertEquals("K", translator.translateString("H", 3));
    }

    @Test
    void testWordsWithSpecialCharacters() {
        assertEquals("def.!?", translator.translateString("abc.!?", 3));
    }

    @Test
    void testSpecialCharacters() {
        assertEquals(
            "!$%^&*(){}:@~<>.,';][",
            translator.translateString("!$%^&*(){}:@~<>.,';][", 3));
    }

    @Test
    void testPound() {
        assertNotEquals(
            "£",
            translator.translateString("£", 0));
    }

    @Test
    void testWordsWithNumbers() {
        assertEquals("def123", translator.translateString("abc123", 3));
    }

    @Test
    void testNegativeShift() {
        assertEquals("m", translator.translateString("n", -1));
    }

    @Test
    void testNegativeShiftOverflow() {
        assertEquals("z", translator.translateString("a", -1));
    }
}