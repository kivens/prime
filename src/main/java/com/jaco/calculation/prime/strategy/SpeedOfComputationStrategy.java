package com.jaco.calculation.prime.strategy;

/**
 * This class support to sum of primes
 * and focus on speed of computation
 * ( based on sieve of Eratosthenes ).
 * <p>
 * 埃拉托斯特尼筛法，简称埃氏筛或爱氏筛，是一种由希腊数学家埃拉托斯特尼所提出的一种简单检定素数的算法。
 * 要得到自然数n以内的全部素数，必须把不大于根号n的所有素数的倍数剔除，剩下的就是素数。
 */
public class SpeedOfComputationStrategy implements PrimeCalculation {


    public long sum(final int maxVal) {
        if (maxVal < 2) {
            throw new RuntimeException(" Should be input the value greater than 1 !");
        }
        //tag of prime
        boolean[] falseIsPrime = new boolean[maxVal + 1];
        double max = Math.sqrt(maxVal);
        for (int i = 2; i < max; i++) {
            if (!falseIsPrime[i]) {// if i is a prime
                int maxMultipleOfI = maxVal / i;
                for (int j = 2; j <= maxMultipleOfI; j++) {
                    // A multiple of prime is not a prime
                    falseIsPrime[i * j] = true;
                }
            }
        }
        long sum = 0L;

        for (int i = 2; i <= maxVal; i++) {
            if (!falseIsPrime[i]) {
                sum += i;
            }
        }
        return sum;
    }


}
