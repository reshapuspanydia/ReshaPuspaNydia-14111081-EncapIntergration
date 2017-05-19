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
public class Sepeda_motor {
    public void tampilkansepeda_motor() {
        System.out.println("Ini kelas Sepeda Motor");
        Kendaraan kd = new Kendaraan();
        kd.setJenis("Matic");
        System.out.println("Jenis Motor Ini Adalah : " + kd.getJenis());
        kd.setMerk("Honda Scoopy");
        System.out.println("Merk Motor Ini Adalah : " + kd.getMerk());
        
    }
    
}
