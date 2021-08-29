/*
 * This example first reviews the usage of command line arguments
 *
 * This example then reviews standard input from console with two approaches
 * 1. using System.console()
 * 2. using Scanner(System.in): suppprts directly read in integer, double, etc
 *
 * to run the program in console, go to the project folder Ch1_ConsoleInputEx,
 * find its subfolder: build, and the next subfolder classes
 * change directory with command cd to classes folder (in windows)
 * in classes subfolder, run: java ch1_consoleinputex.Ch1_ConsoleInputEx
 */
package com.mycompany.ch1;

import java.util.Scanner;

/**
 *
 * @author ziping
 */
public class Ch1_ConsoleInputEx {
    public static void main(String[] args) {
        System.out.println("Welcome to cs265, here is the args from cmd:");
        for(String s : args)
            System.out.println(s);

        //The System.console() will return null in IDE, 
        //running the class in console or terminal manually        
        /*Console console = System.console();
        String input = console.readLine().trim();
        int num = Integer.parseInt(input);
        int sum = 0;
        
        while (!input.equalsIgnoreCase("quit")) {
            num = Integer.parseInt(input);
            sum += num;
            System.out.println("num: " + num);
            System.out.print("Enter an integer: ");
            input = console.readLine().trim();
        }     
        System.out.println("the summation is:" + sum);*/
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer:");
        int num = scanner.nextInt();
        int sum = 0;
        while(num != -99999){
            sum += num;
            System.out.println("num: " + num);
            System.out.print("Enter a positive integer: ");        
            num = scanner.nextInt();
        }
        System.out.println("the summation is:" + sum);
        scanner.close();
    }
    
}
