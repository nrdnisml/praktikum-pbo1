/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author personal
 */
public class SepedaGunung1841720060Nurudin extends Sepeda1841720060Nurudin{
    private String mTipeSuspensi;
    
    public void setTipeSuspensiNurudin(String newValue){
        mTipeSuspensi = newValue;
    }
    
    public void cetakStatusNurudin(){
        super.cetakStatusNurudin();
        System.out.println("Tipe Suspensi : "+ mTipeSuspensi);
    }
}
