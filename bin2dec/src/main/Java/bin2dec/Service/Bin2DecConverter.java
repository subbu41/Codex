/*
 * Copyright (c) 2019, Liberty Mutual
 * Proprietary and Confidential
 * All Rights Reserved
 */


package bin2dec.Service;

import org.springframework.stereotype.Component;

/**
 * bin2Dec_service
 */
@Component
public class Bin2DecConverter {

    private String binNum;

    public int translateBinary(String binNum){
        int count = 0;

        count = count + 1;
        System.out.println("Count is - "+ count);
        int binNumLen = binNum.length();
        int resDec =0;
        if(validateInput(binNum)){

            for(int i=0;i<binNumLen;i++){
                int currNum = Character.getNumericValue(binNum.charAt(i));
//                    System.out.println(currNum);
                int decVal = convertBinaryToDec(currNum,binNumLen-1-i);
                resDec = resDec +decVal;
            }
            System.out.println("The Decimal Number for ["+ binNum +"] is - "+ resDec);
        }

    return resDec;
    }

    private static Integer convertBinaryToDec(int binNum, int numPosition){
        int decNum=0;
        if(binNum == 1){
            decNum = (int) Math.pow(2,numPosition);
        }

        return decNum;
    }

    private static boolean validateInput(String stringInput){

        boolean isValid = true;
        if(!isInteger(stringInput)){
            System.out.println("Entered value is not an Integer. ONLY Binary Numbers 0 or 1 are allowed. So Exiting!!!");
            return false;
        }
        if(stringInput.length() > 8){
            System.out.println("Length of input is greater than 8 characers. Please enter Binary numbers of length 8 at the maximum.");
            return false;
        }

        for(int i=0;i<stringInput.length();i++){
            Integer numInput = Character.getNumericValue(stringInput.charAt(i));
            if(numInput != 0 && numInput!=1){
                System.out.println("You have entered a invalid number. ONLY Binary Numbers 0 or 1 are allowed. So Exiting!!!");
                isValid = false;
                return isValid;
            }
            else
                isValid = true;
        }
        return isValid;
    }

    private static boolean checkCount(int numDigit){
        boolean isCountValid;
        if(numDigit < 8)
            isCountValid = true;
        else
            isCountValid = false;

        return isCountValid;
    }
    private static boolean isInteger(String stringInput){
        try{
            Integer.parseInt(stringInput);
            return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }
}
