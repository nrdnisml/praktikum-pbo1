/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet09.percobaan1;

/**
 *
 * @author personal
 */
public abstract class Hewan1841720060Nurudin {
    private int umur;
    
    protected Hewan1841720060Nurudin(){
        this.umur = 0;
    }
    
    public void bertambahUmurNurudin(){
        this.umur += 1;
    }
    
    public abstract void bergerakNurudin();
}

