/*
 * Copyright (c) 2019, Liberty Mutual
 * Proprietary and Confidential
 * All Rights Reserved
 */


package com.lmig.testChallenge1;

/**
 * Complete an Implementation of a function Solution, that should return a String describing first
 * character of a given String: "digit" for a digit, "lower" for a lowercase letter, "Upper" for a
 * uppercase letter and "Other" for other characters. you can assume the characters are ASCII
 */
public class Solution1 {
    public String solution(String s) {
        char c = s.charAt(0);
        if (Character.isUpperCase(c)) {  // please fix condition
            return "upper";
        } else if (Character.isLowerCase(c)){  // please fix condition
            return "lower";
        } else if (Character.isDigit(c)) {  // please fix condition
            return "digit";
        } else {
            return "other";
        }
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println("MyNameisBilla - " + s.solution("MyNameisBilla"));
        System.out.println("aMyNameisBilla - "+ s.solution("aMyNameisBilla"));
        System.out.println("BMyNameisBilla - " + s.solution("BMyNameisBilla"));
        System.out.println("0MyNameisBilla - "+ s.solution("0MyNameisBilla"));
        System.out.println("^MyNameisBilla - " + s.solution("^MyNameisBilla"));


    }
}
