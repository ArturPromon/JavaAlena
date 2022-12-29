package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class testnumbersTest {

    @Test
    public void sum() {
        testnumbers object = new testnumbers();
        int actual = object.sum(15);
        int expected = 55;
        assertEquals(actual,expected);
    }
}