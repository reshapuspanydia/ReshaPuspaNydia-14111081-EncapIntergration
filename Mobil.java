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
public abstract class Mobil {
    protected String Bahanbakar = "Bensin";
    protected String Suara = "Brem...Brem..";
    
    protected String getBahanbakar(){
        return Bahanbakar;
    }
    
    protected String getSuara() {
        return Suara;
    }
    
    protected abstract void printBahanbakar();
    protected abstract void printSuara();
}
