package com.mycompany.ch3.closeLab7;

/*  
Author: Zach Healy
Date: 9/30/2021
Purpose: Read a file full of names, and then print out all the similar ones. 
*/

import java.io.*;
import java.util.*;

public class cLab7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a file for baby name ranking: ");
        String fileInput = input.nextLine();

        input = new Scanner(new File(
                "C:/Users/zjhea/Documents/GitHub/fall21Git/CS256/ch1/src/main/java/com/mycompany/ch3/closeLab7/"
                        + fileInput));

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        while (input.hasNext()) {
            input.nextInt();
            set1.add(input.next());
            input.nextInt();
            set2.add(input.next());
            input.nextInt();
        }

        set1.retainAll(set2);

        System.out.println(set1.size() + " names are used for both genders.");
        System.out.print("They are: ");

        Iterator it = set1.iterator();
        int count = 1;
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
            if (count % 10 == 0)
                System.out.println();
            count++;
        }
        input.close();
    }

}