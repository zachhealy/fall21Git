package com.mycompany.ch9.cLab15;

import java.io.*;

public class closeLab15 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader("/Users/zachhealy/Desktop/Programming Files/fall21Git/fall21Git/CS256/ch1/src/main/java/com/mycompany/ch9/cLab15/clab15.txt"));
        HashTable hashTable = new HashTable();
        String str;
        while((str = read.readLine()) != null){
            String[] split = str.split(" ");
            for(String word : split){
                hashTable.add(word);
            }

        }
        
        hashTable.displayTable();

    }
}
