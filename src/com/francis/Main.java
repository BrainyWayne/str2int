package com.francis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    printOut("Enter the string to convert to number\n");
	    Scanner scanner = new Scanner(System.in);
	    str2int(scanner.next());
    }

    static void str2int(String string){
        try{
            printOut(String.valueOf(Integer.parseInt(string)));
        } catch (NumberFormatException e){
            printOut("The entered string is not valid");
        }


    }

    static void printOut(String string){
        System.out.print(string);
    }

}
