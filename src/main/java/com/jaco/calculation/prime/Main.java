package com.jaco.calculation.prime;

import com.jaco.calculation.prime.strategy.PrimeCalculation;
import com.jaco.calculation.prime.strategy.ReduceLoopingCountStrategy;
import com.jaco.calculation.prime.strategy.SpeedOfComputationStrategy;

public class Main {


    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------");
        System.out.println(" This is the program which support sum of all primes. ");
        System.out.println("-------------------------------------------------------");

        int val = 200000;
        printResult(new SpeedOfComputationStrategy(), val);
        printResult(new ReduceLoopingCountStrategy(), val);

    }

    private static void printResult(PrimeCalculation sumOfPrime, int maxVal) {
        long startTime = System.currentTimeMillis();
        long sum = sumOfPrime.sum(maxVal);
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("%s - The sum of all prime numbers below %s is %s , spend %s ms", sumOfPrime.getClass().getSimpleName(), maxVal, sum, endTime - startTime));
    }
}
