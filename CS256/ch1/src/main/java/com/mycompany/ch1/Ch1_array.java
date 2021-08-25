/*
 * This example reviews java 1-D array, method and constant
 * This example also reviews Java method is pass by value
 * @author ziping
 * date: August 23, 2020
 */
package com.mycompany.ch1;

public class Ch1_array {
    public static final int MAX = 999; //MAX is a constant with value 999

    public static void main(String[] args) { 
        System.out.println("MAX constant value is: " + MAX);
                
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
        // #2 step, assign values through method calling
        // notice array is object, hence it is reference(not call by reference)
        initializeArray(anArray);
        System.out.println("The original array is:");
        for(int i = 0; i < 10; i++) {
            //#1 step, assign values in main
            //anArray[i] = (i+1) *100;
            System.out.printf("Element at index %d: %d\n", i, anArray[i]);

            //FORMATTED OUTPUT -> printf();
        }
        
        int[] bArray = new int[10];
        bArray = reverse(anArray);
        System.out.println("\nAfter reversing, the array is:");
        for(int i = 0; i < 10; i++) {
            System.out.printf("Element at index %d: %d\n", i, bArray[i]);
        }   
        
        java.util.Arrays.sort(bArray);
        int k = 0;
        System.out.println("\nAfter calling Arrays's sort() method, the array is:");
        for(int num : bArray) {
            System.out.printf("Element at index %d: %d\n", k, num);
            k++;
        }
                
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];
        
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        //char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println("\nAfter char array is copied:");
        System.out.println(new String(copyTo)); 
        
        int x = 100, y = -900;
        swapInt(x, y);
        System.out.println("\nx and y swapped? " + (x == -900 && y == 100));
        
        int[] arr = new int[2];
        arr[0] = 100;
        arr[1] = -900;
        swapInt(arr[0], arr[1]);
        System.out.println("\narr[0] and arr[1] swapped? " + (arr[0] == -900 && arr[1] == 100));
        
        swapArr(arr);
        System.out.println("\ncalling swapArr( ) method\narr[0] and arr[1] swapped? " + (arr[0] == -900 && arr[1] == 100));        
    }
    
    /*
     * Purpose: assign values to an array passed in via parameter
     * Precondition: an integer array initArr must exist
     * Postcondition: each element in integer array initArr is assigned with a value
     */
    public static void initializeArray(int []initArr) {
        //#3 step, we can change initArr to have its own copies of values 
        //and we will see the difference
        //initArr = new int[10];
        for(int i = 0; i < 10; i++) {
            initArr[i] = (i+1) * MAX; //(-100);
        }
    }

    /*
     * Purpose: reverse an integer array passed in via parameter
     * Precondition: an integer array list must exist
     * Postcondition: a new integer array whose elements are in reversed order 
     *                of list is returned
     */    
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
    
    /*
     * Java method is pass by value: num1 and num2 carry integer values from main
     * integer variable x and y in main( ) will not be changed
     */
    public static void swapInt(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
    
    /*
     * Java method is pass by value: integer array arrNum is a reference
     * arrNum and arr from main( ) point to the same heap memory block
     * two integer numbers stored in heap memory are updated
     */
    public static void swapArr(int[] arrNum) {
        int temp = arrNum[0];
        arrNum[0] = arrNum[1];
        arrNum[1] = temp;
    }
}
