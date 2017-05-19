/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapintegration;

/**
 *
 * @author Respus
 */
public class Main {
    public static void main(String[] args){
        Kendaraan kd = new Kendaraan();
        System.out.println("Ini Kelas Kendaraan");
         System.out.println("------------------");
        
        Mobilkodok mk =  new Mobilkodok();
        mk.tampilmobil();
          System.out.println("------------------");
        mk.tampilmobilkodok();
        mk.printBahanbakar();
        mk.printSuara();
         System.out.println("------------------");
        
        Sepeda_motor sm = new Sepeda_motor();
        sm.tampilkansepeda_motor();
    }
    
}
