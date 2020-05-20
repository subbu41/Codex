/*
 * Copyright (c) 2019, Liberty Mutual
 * Proprietary and Confidential
 * All Rights Reserved
 */


package com.lmig.testChallenge1;

import java.util.Arrays;

/**
 * Find the bugs and modify one line of code in the incorrect Implementation of a function solution
 * that is supposed to return the sum of all elements in the given array A which contains atmost 1000
 * integers within range (-1000...1000)
 *
 * Notice that for the example test A = [0,1,2,3,4] the atached code is already returning correct answer 10;
 */
public class Findbugs {
    int findbugs(int[] A) {
        int ans = 0;
        for (int i = 1; i < A.length; i++) {
            ans += A[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Findbugs f = new Findbugs();
        int[] A = {0,1,2,3,4};
        System.out.println(Arrays.toString(A) + ", the Sum is - " + f.findbugs(A));
        int[] b = {-142,900,424,215,123,455,-986,12,0,4,3,56,78};
        System.out.println(Arrays.toString(b) + ", the Sum is - " + f.findbugs(b));
    }

}
