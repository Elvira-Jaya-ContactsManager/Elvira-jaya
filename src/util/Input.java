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
        System.out.println(prompt);
        return getName();
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
