package com.jaco.calculation.prime.strategy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test of SpeedOfComputationStrategy class.
 */
public class SpeedOfComputationStrategyTest {

    @Test
    public void testSumSuccessed() {
        PrimeCalculation calculation = new SpeedOfComputationStrategy();
        Assert.assertEquals(calculation.sum(10000), 5736396);
    }

    @Test(expected = RuntimeException.class)
    public void testSumFailed() {
        PrimeCalculation calculation = new SpeedOfComputationStrategy();
        calculation.sum(-10000);
    }
}
