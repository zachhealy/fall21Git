/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ch2;

/**
 *
 * @author ziping
 */
public class Point2D {
    private double m_x;
    private double m_y;

    public Point2D(double p_x, double p_y){
        m_x = p_x ;
        m_y = p_y;
    }

    public String toString(){
        return String.format("[x = %.1f, y = %.1f]", m_x, m_y);
    }
    
    public boolean equals(Point2D another){
        return m_x == another.m_x && m_y == another.m_y;
    }

    public double distance(Point2D another){
        return java.lang.Math.sqrt((m_x - another.m_x) * (m_x - another.m_x) + 
       (m_y - another.m_y) * (m_y - another.m_y));
    }

    public static double distance(Point2D one, Point2D two){
        return java.lang.Math.sqrt((one.m_x - two.m_x) * (one.m_x - two.m_x) + 
                                    (one.m_y - two.m_y) * (one.m_y - two.m_y));    
    }
    
    public Point2D midpoint(Point2D another){
        double mid_x = (m_x + another.m_x) / 2;
        double mid_y = (m_y + another.m_y) / 2 ;
        Point2D retPoint = new Point2D(mid_x, mid_y);
        return retPoint;
    } 
    
    // Knowlegde check 1: 
    // Complete the following method: 
    // dotProduct(Point2D vector)
    // Computes dot (scalar) product of the vector represented by this instance 
    // and the specified vector. 
    
    // Knowlegde check 2: 
    // Complete the following method: 
    // subtract(Point2D point)
    // Returns a point with the coordinates of the specified point subtracted from 
    // the coordinates of this point.
}
