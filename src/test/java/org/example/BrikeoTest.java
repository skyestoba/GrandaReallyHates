package org.example;

import junit.framework.TestCase;

public class BrikeoTest extends TestCase {

    public void testBrikeoLikesWord(){
        Brikeo b = new Brikeo();
        assertFalse(b.likesWord(""));
        assertFalse(b.likesWord("ablaze"));
        assertTrue(b.likesWord(""));
    }



}