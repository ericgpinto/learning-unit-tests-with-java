package com.ericpinto.unittests.services;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AssertTest {

    @Test
    public void test(){
        Assert.assertTrue(true);
        Assert.assertEquals(1, 1);
        Assert.assertEquals(0.51, 0.51, 0.01);

        int i = 5;
        Integer i2 = 5;
        Assert.assertEquals(Integer.valueOf(i), i2);
        Assert.assertEquals(i, i2.intValue());

        Assert.assertEquals("bola", "Bola");
        Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
    }
}

