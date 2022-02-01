package org.example;

import junit.framework.TestCase;

public class XenaTest extends TestCase {

    public void testXenaLikesWord() {
        Xena x = new Xena();
        assertTrue(x.likesWord("zoo"));
        assertFalse(x.likesWord("floor"));
        assertFalse(x.likesWord(""));
    }
}