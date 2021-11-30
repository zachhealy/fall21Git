package com.mycompany.ch9.projectFive;

/*  
Author: Zach Healy, Noah Little, Jace Lowe
Date: 11/29/2021
Purpose: This program writes an IntegerSet file that does a variety of functions that the user decides.
*/

import java.util.Scanner;

public class projectFive {
    public static void main(String[] args) {
      IntegerSet s1 = new IntegerSet();
      IntegerSet s2 = new IntegerSet();
      Integer a = 10;
      Integer b = 3;
      Integer c = 5;

      Scanner input = new Scanner(System.in);
      boolean quit = false;
      // loops until user quits
      while (!quit) {

        System.out.println("0. Quit, 1. IntegerSet, 2. size, 3. isEmpty, 4. isMember");
        System.out.println("5. add, 6. remove, 7. union, 8. intersection, 9. difference");
        System.out.println("10. display, 11. isSubset.");
        System.out.println("Enter which function you'd like to test: ");
        int in = input.nextInt();

        switch (in) {
          case 0:
            quit = true;
            break;
          case 1:
            IntegerSet s3 = new IntegerSet();
            System.out.println(s3);
            break;
          case 2:
            System.out.println(s1.size());
            break;
          case 3:
            System.out.println(s1.isEmpty());
            break;
          case 4:
            System.out.println(s1.isMember(a));
            break;
          case 5:
            System.out.println("What number would you like to enter?");
            Integer temp = input.nextInt();
            s1.add(temp);
            break;
          case 6:
            s1.remove(4);
            break;
          case 7:
            System.out.println(s1.union(s2));
            break;
          case 8:
            System.out.println(s1.intersection(s2));
            break;
          case 9:
            System.out.println(s1.difference(s2));
            break;
          case 10:
            s1.display();
            break;
          case 11:
            s1.isSubset(s2);
            break;
        }
        System.out.println();
    }    


    }
    
}
