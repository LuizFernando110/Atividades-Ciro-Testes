package com.exemplo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class testIdentifierTests {
    @Test
    void testCorrectIndetifier(){
        Identifier id = new Identifier();
        String text = "abc12";
        assertTrue(id.validateIdentifier(text));
    }

    @Test
    void testIdentifierWithNumberOnBegin() {
        Identifier id = new Identifier();
        String text = "1abc";
        assertFalse(id.validateIdentifier(text));
    }

    @Test
    void testIdentifierItsBiggerThanSixCharacters() {
        Identifier id = new Identifier();
        String text = "abcdefg";
        assertFalse(id.validateIdentifier(text));
    }

    @Test
    void testIdentifierIsAnEmptyString() {
        Identifier id = new Identifier();
        String text = " ";
        assertFalse(id.validateIdentifier(text));
    }

    @Test
    void testIdentifierHasSymbols() {
        Identifier id = new Identifier();
        String text = "ab1_def";
        assertFalse(id.validateIdentifier(text));
    }
    
    @Test
    void testIdentifierHasSpaceBetweenCharacters() {
        Identifier id = new Identifier();
        String text = "abc de";
        assertFalse(id.validateIdentifier(text));
    }

    @Test
    void testIdentifierHasAtLeastOneCharacter(){
        Identifier id = new Identifier();
        String text = "a";
        assertTrue(id.validateIdentifier(text));
    }

    @Test
    void testIdentifierHasExactSixCharacters() {
        Identifier id = new Identifier();
        String text = "abc123";
        assertTrue(id.validateIdentifier(text));
    }

    @Test
    void testIdentifierStartsWithALetter() {
        Identifier id = new Identifier();
        String text = "a12345";
        assertTrue(id.validateIdentifier(text));
    }   

    @Test
    void testIdentifierEndsWithASymbol() {
        Identifier id = new Identifier();
        String text = "abc12!";
        assertFalse(id.validateIdentifier(text));
    }
}
