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
public class Orang1841720060Nurudin {
private String nama;
private Hewan1841720060Nurudin hewanPeliharaan;

    public Orang1841720060Nurudin(String nama) {
        this.nama = nama;
    }


    public void peliharaHewan(Hewan1841720060Nurudin hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku "+this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerakNurudin();
        System.out.println("-----------------------------------------");
    }
}
