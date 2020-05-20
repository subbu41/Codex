/*
 * Copyright (c) 2019, Liberty Mutual
 * Proprietary and Confidential
 * All Rights Reserved
 */


package com.lmig.testChallenge1;

import java.util.ArrayList;

/**
 * SubStrings
 */
public class SubStrings {
    public int subStringSoln(String S) {
        // write your code in Java SE 8
        int numOfSubString = 0;
        int n = S.length();

        ArrayList<String> strings = new ArrayList<String>();

        String curr = "";

        for(int i =0;i<n;i++){
            if(curr.indexOf(S.charAt(i)) == -1) {
                curr += S.charAt(i);
            }
            else{
                strings.add(curr);
                curr = ""+S.charAt(i);
            }
        }
          strings.add(curr);

        return strings.size();
    }

    public static void main(String[] args) {
        SubStrings subStrings = new SubStrings();
        String s = "world";
        System.out.println("The number of Substrings for '- "+s +"' is - "+ subStrings.subStringSoln(s));
        s = "dddd";
        System.out.println("The number of Substrings for '- "+s +"' is - "+ subStrings.subStringSoln(s));
        s = "abba";
        System.out.println("The number of Substrings for '- "+s +"' is - "+ subStrings.subStringSoln(s));
        s = "cycle";
        System.out.println("The number of Substrings for '- "+s +"' is - "+ subStrings.subStringSoln(s));

    }
}
