package org.example;

import junit.framework.TestCase;

public class EllwoodTest extends TestCase {

    public void testLikesWord() {

        Ellwood e = new Ellwood();
        assertTrue(e.likesWord("floor"));
        assertFalse(e.likesWord("hat"));
        assertFalse(e.likesWord(""));
    }
}