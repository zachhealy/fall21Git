/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclassex3_point2d;

//import javafx.geometry.Point2D;

/**
 *
 * @author ziping
 */
public class JavaClassEx3_Point2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1, 2); 
        Point2D p2 = new Point2D(3, 5); 
        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());
        System.out.printf("The distance between p1 and p2 is %.2f\n", 
                            p1.distance(p2)); 
        System.out.printf("The distance between p1 and p2 is %.2f\n", 
                            Point2D.distance(p1,p2));         
        System.out.println("The midpoint between p1 and p2 is " + 
                            p1.midpoint(p2).toString());
        System.out.println("p1 equals p2? " + p1.equals(p2));     
        
        // [Call your Knowledge check 1 method here.]
        
        // [Call your Knowledge check 2 method here.]
    }
    
}
