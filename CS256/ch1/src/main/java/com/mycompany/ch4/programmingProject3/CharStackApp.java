package com.mycompany.ch4.programmingProject3;

import java.io.*;
import java.util.Scanner;
import com.mycompany.ch4.closeLab10.ListStack;

public class CharStackApp {

    public static void main(String[] args) throws IOException {
        ListStack<Character> stack = new ListStack<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name ");
        String fileName = input.nextLine();

        BufferedReader read = new BufferedReader(new FileReader(
                "/Users/zachhealy/Desktop/Programming Files/fall21Git/fall21Git/CS256/ch1/src/main/java/com/mycompany/ch4/programmingProject2/"
                        + fileName));
        BufferedWriter write = new BufferedWriter(new FileWriter(
                "/Users/zachhealy/Desktop/Programming Files/fall21Git/fall21Git/CS256/ch1/src/main/java/com/mycompany/ch4/programmingProject2/output.txt"));
        String str;
        while ((str = read.readLine()) != null) {
            str = str.toLowerCase().replaceAll("\\W", "");
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }
            String reverse = "";
            while (!stack.isEmpty()) {
                reverse += stack.pop().toString();
            }
            if (str.equals(reverse)) {
                write.write("Is a palindrome: " + reverse);
                write.newLine();
            } else {
                write.write("Not a palindrome");
                write.newLine();
            }
        }

        read.close();
        write.close();
    }

}
