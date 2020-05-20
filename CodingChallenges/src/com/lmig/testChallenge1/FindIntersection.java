/*
 * Copyright (c) 2019, Liberty Mutual
 * Proprietary and Confidential
 * All Rights Reserved
 */


package com.lmig.testChallenge1;

import java.util.*;

/**
 * FindIntersection
 */
public class FindIntersection {
    public static String FindIntersection(String[] strArr) {
        // code goes here
        String[] a = strArr[0].split(",");
        String[] b = strArr[1].split(",");
        String

        for(int i=0;i<a.length;i++){
            if(Arrays.binarySearch(b,a[i])> 0){

            }


            if(Arrays.binarySearch(b,a[i])){

            }
        }


        return strArr[0];
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FindIntersection(s.nextLine()));
    }

}