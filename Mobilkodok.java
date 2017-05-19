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
public class Mobilkodok extends Mobil {
    
    public void tampilmobil() {
    System.out.println("Ini Kelas Mobil");
        Kendaraan mbl = new Kendaraan();
        mbl.setMerk("Volkswagen");
        System.out.println("Merk Mobil Ini = " + mbl.getMerk());
        mbl.setJenis("Mini Bus");
        System.out.println("Jenis Mobil Ini = " + mbl.getJenis());
    }
    
    public void tampilmobilkodok() {
        System.out.println("Kelas Mobilkodok turunan Mobil");
    }
        @Override
        protected void printBahanbakar() {
        System.out.println("Mobil ini menggunakan bahan bakar : " + super.getBahanbakar());
    }
      @Override
        protected void printSuara() {
        System.out.println("Mobil ini bersuara : " + super.getSuara());  
    }
    }
