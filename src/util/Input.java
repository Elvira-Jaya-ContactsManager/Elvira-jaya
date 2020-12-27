package util;

import java.util.Scanner;

public class Input {
    //scanner property
    private Scanner scanner;

    //Input constructor to create scanner instance
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //Method for user input
    public String getName(){
        return this.scanner.next();
    }

    //Method with String parameter that will act as a prompt
    public String getName(String prompt){
//        System.out.println(prompt);
//        String userChoice = scanner.next();
//        if(userChoice.isEmpty()|| Character.isDigit(Integer.parseInt(userChoice))){
//            System.out.println("INVALID ENTRY! Please enter valid name in characters");
//        }
//        System.out.println(prompt);
//        return userChoice;
    }

    //Method to validate user Input within range with a prompt
    public int getInt(int min, int max) {
       return getInt(min, max, "Please enter an int between " + min + " and " + max);

    }

    //Method to validate user Input within range
    public int getInt(int min, int max,String prompt ){
        int input;
        do{
            System.out.println(prompt);
            input = this.scanner.nextInt();

            //Checking to see if user input is valid
            if(input > max || input < min) {
                System.out.println("INVALID ENTRY! Please enter a number between " + min + " and " + max +": ");
                int userChoice = scanner.nextInt();
            }

        } while(input < min || input > max);

        return input;
    }
    //prompt for yes/no response from user
    public boolean yesNo(){
        return yesNo("Please enter yes or no[y/n]:");
    }

    // yesNo a method that includes a string as a parameter
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String input = this.scanner.next();
        return (input.trim().equalsIgnoreCase("y") ||
                input.trim().equalsIgnoreCase("yes"));
    }

    //get phone number from user
    public long getPhoneNumber(){
        System.out.println("Please enter a 10 digit phone number:");
        return this.scanner.nextLong();
    }

}
