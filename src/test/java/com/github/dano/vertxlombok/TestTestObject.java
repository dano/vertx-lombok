package com.github.dano.vertxlombok;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dan on 4/9/16.
 */
public class TestTestObject {
    @Test
    public void doTest() {
        MyData data = new MyData("hi");
        assertEquals("hi", data.getData());
    }
}
