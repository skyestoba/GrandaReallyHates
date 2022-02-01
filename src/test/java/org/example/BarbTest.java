package org.example;

import junit.framework.TestCase;

public class BarbTest extends TestCase {

    public void testBarbLikesWord() {
        Barb b = new Barb();
        assertTrue(b.likesWord("else"));
        assertFalse(b.likesWord("dog"));
        assertFalse(b.likesWord(""));

    }
}