package com.mycompany.exam.examTwo;

import java.util.ArrayList;

public class JProduct implements Cloneable, Comparable<JProduct> {
    private int m_id;
    private String m_name;
    private double m_wholesaleprice;
    private ArrayList<String> m_retailers = new ArrayList<String>();

    public JProduct(){
        m_id = 24;
        m_name = "Zach";
        m_wholesaleprice = 3.50;
        m_retailers.add("Khol's");

    }
    public JProduct(int id, String name, double wholesaleprice, String retailers){
        m_id = id;
        m_name = name;
        m_wholesaleprice = wholesaleprice;
        m_retailers.add(retailers);

    }

    public void setPrice(double price){
        m_wholesaleprice = price;

    }

    public void setRetailers(ArrayList<String> retails){
        m_retailers.addAll(retails);

    }

    public int getID(){
        return m_id;

    }
    public String getName(){
        return m_name;

    }
    public double getwholesaleprice(){
        return m_wholesaleprice;

    }
    public ArrayList<String> getRetailers(){
        return (ArrayList<String>) m_retailers.clone();

    }

    @Override
    public int compareTo(JProduct o) {
        if(o.getwholesaleprice() > m_wholesaleprice){
            return 1;

        } else if(m_wholesaleprice > o.getwholesaleprice()){
            return -1;

        }else{
            return 0;

        }

    }
    @Override
    public Object clone() {
        try{
            JProduct productClone = (JProduct) super.clone();
            productClone.m_retailers = (ArrayList<String>)(m_retailers.clone());
            return productClone;

        }catch(CloneNotSupportedException e){
            return null;

        }

    }
    
}
