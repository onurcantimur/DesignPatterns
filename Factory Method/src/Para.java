/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public abstract class Para {
    private int nominal_deger;
    
    public void setNominalDeger(int  sayi){
        nominal_deger = sayi;
    }
    
    public String getNominalDeger(){
        return Integer.toString(nominal_deger);
    }
}
