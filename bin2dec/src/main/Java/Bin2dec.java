import java.util.Scanner;

public class Bin2dec {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        translateBinary();

    }

    private static void translateBinary(){
        String input;
        int count = 0;
        do{
            System.out.println("Enter a binanry Number:");
            input = scanner.nextLine();
            System.out.println(input);
            count = count + 1;
            System.out.println("Count is -"+ count);
        }
        while (validateInput(input) && count < 8);
    }

    private static boolean validateInput(String stringInput){

        boolean isValid;
        Integer numInput = Integer.parseInt(stringInput);
        if(numInput == 0 || numInput == 1)
        {
            isValid = true;
        }
        else{
            System.out.println("You have entered a invalid number. ONLY Binary Numbers 0 or 1 are allowed. So Exiting!!!");
            isValid = false;
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


}
