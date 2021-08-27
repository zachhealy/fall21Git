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
public class Time {
    private int m_hour;
    private int m_minute;
    private char m_AMPM;
    private static int numberOfTime = 0;
    Time(){
        m_hour = 12;
        m_minute = 0;
        m_AMPM = 'A';
        numberOfTime++;
    }
    
    Time(int pHour, int pMinute, char pAMPM){
        m_hour = pHour;
        m_minute = pMinute;
        m_AMPM = pAMPM;
        numberOfTime++;
    }
    
    public int getHour(){
        return m_hour;
    }
    
    public int getMinute(){
        return m_minute;
    }
    
    public char getAMPM(){
        return m_AMPM;
    }
    
    public void setTime(int pHour, int pMinute, char pAMPM){
        m_hour = pHour;
        m_minute = pMinute;
        m_AMPM = pAMPM;
    }
    
    public void setHour(int pHour){
        m_hour = pHour;
    }
    
    public String toString(){
        String retStr = Integer.toString(m_hour) + ':' 
                + Integer.toString(m_minute) + m_AMPM + 'M';
        return retStr;
    }
    
    public static int getNumTime(){
        return numberOfTime;
    }    
}
