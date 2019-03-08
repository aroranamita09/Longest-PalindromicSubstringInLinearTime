package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {

    LongestSubstring obj;
    @Before
    public void setUp() throws Exception {
        obj = new LongestSubstring();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void countStr() {
        assertEquals( "geeksskeeg",  obj.longestPalSubstr("forgeeksskeegfor"));
    }
}
