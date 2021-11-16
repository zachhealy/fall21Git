package project4;

import java.util.Scanner;

public class Project4 {

        public static void main(String[] args) {
                String s = "Test";
                Queue inv = new Queue();
                Scanner input = new Scanner(System.in);

                while (!s.equals("end")) {
                        System.out.println("What function would you like to execute? (add, remove, end)");
                        s = input.nextLine();
                        if (s.equals("add")) {
                                System.out.println("Enter serial number: ");
                                int sNum = input.nextInt();
                                String temp = input.nextLine();
                                System.out.println("Enter Date: ");
                                String date = input.nextLine();
                                System.out.println("Enter Lot Num: ");
                                int lNum = input.nextInt();
                                temp = input.nextLine();

                                inventory i = new inventory(sNum, date, lNum);
                                inv.enqueue(i);

                        } else if (s.equals("remove")) {
                                inv.dequeue();
                        }
                }
                System.out.println(inv);

        }
}
