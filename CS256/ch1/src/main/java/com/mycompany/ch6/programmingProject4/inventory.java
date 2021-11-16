/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;



public class inventory {
    int serialNum;
    String manufactDate;
    int lotNum;

    public inventory(){
        serialNum = 000001;
        lotNum = 000001;
        manufactDate = new String();

    }
    public inventory(int sNum, String date, int lNum){
        serialNum = sNum;
        lotNum = lNum;
        manufactDate = date;

    }

    public int getSerialNum() {
        return serialNum;
    }
    public int getLotNum() {
        return lotNum;
    }
    public String getManufactDate() {
        return manufactDate;
    }
    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }
    public void setLotNum(int lotNum) {
        this.lotNum = lotNum;
    }
    public void setManufactDate(String manufactDate) {
        this.manufactDate = manufactDate;
    }

    @Override
    public String toString() {
        String r = "serial number: " + serialNum + "\n" + "manufacturer: " + manufactDate + "\n" + "Lot Number: " + lotNum + "\n";
        return r;
        
    }

}