package org.example;

import junit.framework.TestCase;

public class ThelmaTest extends TestCase {

    public void testLikesWord() {
        Thelma t = new Thelma();
        assertTrue(t.likesWord("through"));
        assertFalse(t.likesWord("sail"));
        assertFalse(t.likesWord(""));
    }
}