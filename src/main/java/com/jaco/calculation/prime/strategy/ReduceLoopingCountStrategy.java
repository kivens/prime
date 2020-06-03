package com.jaco.calculation.prime.strategy;

/**
 * This class support to sum of primes
 * and focus on reducing the looping count
 * ( based on Euler function).
 * <p>
 * 线性筛(欧拉筛法) 在埃氏筛法的基础上，让每一个合数，只被它的最小质因子筛选一次，达到不重复的目的。
 */
public class ReduceLoopingCountStrategy implements PrimeCalculation {


    public long sum(int maxVal) {

        if (maxVal < 2) {
            throw new RuntimeException(" Should be input the value greater than 1 !");
        }

        //tag of prime
        boolean[] falseIsPrime = new boolean[maxVal + 1];
        // cache the primes
        int[] prime = new int[maxVal > 10000 ? maxVal / 8 : maxVal];
        int totalPrimes = 0;
        long sum = 0;

        for (int i = 2; i <= maxVal; i++) {
            if (!falseIsPrime[i]) {// if i is prime
                prime[totalPrimes++] = i;
                sum += i;
            }
            for (int j = 0; j < totalPrimes && i * prime[j] <= maxVal; j++) {
                // A multiple of prime is not a prime
                falseIsPrime[i * prime[j]] = true;
                if (i % prime[j] == 0) {
                    break;
                }
            }
        }
        return sum;
    }
}
