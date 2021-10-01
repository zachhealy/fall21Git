package com.mycompany.ch3.closeLab7;

import java.io.*;
import java.util.*;

public class cLab7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a file for baby name ranking: ");
        String fileInput = input.nextLine();

        input = new Scanner(new File(fileInput));

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        while (input.hasNext()) {
            input.nextInt();
            set1.add(input.next());
            input.nextInt();
            set2.add(input.next());
            input.nextInt();

        }
        System.out.println(set1);

    }

}