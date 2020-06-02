package com.jaco.calculation.prime.strategy;

/**
 * Support to calculate of prime.
 */
public interface PrimeCalculation {

    /**
     * The sum of all prime numbers below maxVal
     *
     * @param maxVal The natural number
     * @return The sum
     */
    long sum(int maxVal);
}
