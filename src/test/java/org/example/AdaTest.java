package org.example;

import junit.framework.TestCase;

public class AdaTest extends TestCase {

    public void testLikesWord() {
        Ada a = new Ada();
        assertTrue(a.likesWord("alligator"));
        assertFalse(a.likesWord("floor"));
        assertFalse(a.likesWord(""));
    }
}