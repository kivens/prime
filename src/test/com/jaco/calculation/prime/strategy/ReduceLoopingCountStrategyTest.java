package com.jaco.calculation.prime.strategy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test of ReduceLoopingCountStrategy class.
 */
public class ReduceLoopingCountStrategyTest {

    @Test
    public void testSumSuccessed() {
        PrimeCalculation calculation=new ReduceLoopingCountStrategy();
        Assert.assertEquals(calculation.sum(10000),5736396);
    }

    @Test(expected = RuntimeException.class)
    public void testSumFailed() {
        PrimeCalculation calculation=new ReduceLoopingCountStrategy();
        calculation.sum(-10000);
    }
}
